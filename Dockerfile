FROM mhart/alpine-node

EXPOSE 3000

COPY . node-jenkins-app-example/src

CMD ["node", "app.js"]
