const db = require('./db.js')

const pgsql = require('pg');
const express = require('express');
const app = express();
// app.use(express.static('../public'))
app.listen(8088, () => {
    console.log('fucking 8088!')
})
//设置跨域访问
app.all('*', function(req, res, next) {
    res.header("Access-Control-Allow-Origin", "*");
    res.header("Access-Control-Allow-Headers", "X-Requested-With");
    res.header("Access-Control-Allow-Methods","PUT,POST,GET,DELETE,OPTIONS");
    res.header("X-Powered-By",' 3.2.1')
    res.header("Content-Type", "application/json;charset=utf-8");
    next();
});

let conn = pgsql.Pool(db.pgsql);

conn.connect();

app.get('/', function (req, res) {
    console.log(req)
    console.log('this is a dB test')
    let sql_qur = 'select * from "public"."Gov_Manager"';
    conn.query(sql_qur, function (error, result, fields) {
        // console.log(result);
        if (error) {
            console.log(error)
        }
        res_send = JSON.stringify(result.rows);
        console.log(res_send)
        res.send(res_send)
        console.log('DB END')
        // conn.end();
    })
})




// var server = require('http').createServer(app);


