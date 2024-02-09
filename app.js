// const express = require('express')
// const app = express()

// app.get('/', (req, res) => res.send('Hello World!'))

// var server = app.listen(3000, () => {
//     console.log("Listening on port " + server.address().port + "...");
// });

// module.exports = server;


var express = require('express');
var app = express();
app.get('/', function (req, res) {
  res.send('Hello Jyothi!, I am an IBM intern');
});
app.listen(3000, function () {
  console.log('Example app listening on port 3000!');
});
