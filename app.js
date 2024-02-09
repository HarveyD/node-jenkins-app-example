const express = require('express')
const app = express()

app.get('/', (req, res) => res.send('Hii World, How r u?'))

var server = app.listen(3000, () => {
    console.log("Listening on port " + server.address().port + "...");
});

module.exports = server;
