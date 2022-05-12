FROM node
EXPOSE 4200
RUN mkdir -p /usr/src/app
WORKdir /usr/src/app
COPY package.json package.json

RUN npm install -g @angular/cli@latest
COPY . . 

CMD ["npm", "start"]
