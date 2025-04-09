FROM node:18 AS builder

# From docker-compose.yml
ARG REACT_APP_API_KEY

# ARG to ENV
ENV REACT_APP_API_KEY=$REACT_APP_API_KEY

WORKDIR /app
COPY package.json ./
RUN npm install
COPY . .
RUN npm run build

# run Nginx
FROM nginx:alpine
COPY --from=builder /app/build /usr/share/nginx/html
EXPOSE 80
COPY nginx.conf /etc/nginx/conf.d/default.conf
CMD ["nginx", "-g", "daemon off;"]