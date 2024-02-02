const express = require('express')
// const app = express()

// app.get('/', (req, res) => res.send('Hello World!'))

// var server = app.listen(3000, () => {
//     console.log("Listening on port " + server.address().port + "...");
// });

// module.exports = server;



// import express from "express";
const app = express();
const port = 3000;

app.get("/", (req, res) => {
  res.send("Hello World");
});



app.listen(port, () => {
    console.log(`Server started on port ${port}`);
  });
  
