module.exports = {
    outputDir: './../src/main/resources/static',
    devServer: {
        proxy: {
            '/api': {
                target: 'http://localhost:8080/api',
                ws: true,
                changeOrigin: true
            },
            '/example': {
                target: 'http://localhost:8080/example',
                ws: true,
                changeOrigin: true
            }
        }
    }
};