
const express = require('express');
const app = express();
const server = require('http').Server(app);
const io = require('socket.io')(server);
const records = require('./records.js');
const port = process.env.PORT || 3000;

// �[�J�u�W�H�ƭp��
let onlineCount = 0;

app.get('/', (req, res) => {
    res.sendFile( __dirname + '/views/index.html');
});

io.on('connection', (socket) => {
    // ���s�u�o�ͮɼW�[�H��
    onlineCount++;
    // �o�e�H�Ƶ�����
    io.emit("online", onlineCount);
    // �o�e�����̤j��
    socket.emit("maxRecord", records.getMax());
    // �o�e����
    socket.emit("chatRecord", records.get());

    socket.on("greet", () => {
        socket.emit("greet", onlineCount);
    });

    socket.on("send", (msg) => {
        // �p�G msg ���e��Ȥp�� 2 ����O�T���ǰe������
        // �]���ڭ̪��� return �A�פ�禡����C
        if (Object.keys(msg).length < 2) return;
        records.push(msg);
    });

    socket.on('disconnect', () => {
        // ���H���u�F�A���H
        onlineCount = (onlineCount < 0) ? 0 : onlineCount-=1;
        io.emit("online", onlineCount);
    });
});

records.on("new_message", (msg) => {
    // �s���T�����ѫ�
    io.emit("msg", msg);
});

server.listen(port, () => {
    console.log("Server Started. http://localhost:" + port);
});

