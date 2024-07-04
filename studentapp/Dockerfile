# Use a slim Node.js image for efficiency
FROM node:16-alpine AS builder

WORKDIR /app

# Copy package.json and package-lock.json for dependency installation
COPY package*.json ./

# Install dependencies in a separate stage for caching
RUN npm install --silent

# Create a new stage for the final image, copying only necessary files
FROM node:16-alpine

WORKDIR /app

# Copy only the application code and assets
COPY . .

# Expose port 3000 for development access
EXPOSE 3000

# Start the application in development mode
CMD [ "npm", "start" ]
