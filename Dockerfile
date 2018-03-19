FROM mhart/alpine-node

EXPOSE 3000

WORKDIR /app

COPY . /app

CMD ["node", "app.js"]
