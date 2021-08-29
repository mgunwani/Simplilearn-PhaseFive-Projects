FROM node:12.16.1-alpine As builder
WORKDIR /usr/src/app
COPY package.json package-lock.json ./
RUN npm install
COPY . .
RUN npm run build --prod
FROM nginx:1.15.9-alpine
COPY --from=builder /usr/src/app/dist/angular-demo-project /usr/share/nginx/html