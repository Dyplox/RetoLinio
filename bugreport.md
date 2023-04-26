---
name: "\U0001F41B 500 Internal Server Error"
about: 'SYS-ERR '
title: 'Error 500 al llamar una peticion GET'
labels: 'type/bug'
assignees: 'Equpo Backend'
Priority: 'Highest'
---

### Steps to reproduce
1. Abrir el navagador
2. Ir la la URL 'https://echo-serv.tbxnet.com/v1/qa/test2'

### Expected behavior
El codigo estatus es un 200 y los datos del response tendrian el siguiente esquema
```
{
    "ok": true,
    "date": "2023-04-25T23:37:56.119Z"
}
```

### Actual behavior
El servidor nos muestra un codigo de estatus 500 con el siguiente esquema
```
{
    "code": "SYS-ERR",
    "message": "An Error",
    "details": "An Error",
    "status": 500
}
```


### Environment
URL: 'https://echo-serv.tbxnet.com/v1/qa/test2'
Stage: qa

### Logs
Response body:
```
{
    "code": "SYS-ERR",
    "message": "An Error",
    "details": "An Error",
    "status": 500
}
```

Response headers:
```
 cf-cache-status: DYNAMIC  
 cf-ray: 7bd9ff6dca5f02ce-MIA  
 content-length: 73  
 content-type: application/json; charset=utf-8  
 date: Tue, 25 Apr 2023 22:24:43 GMT  
 etag: W/"49-ArYeecwz7A1vE9c4IF/dQ6Ufivc"  
 server: cloudflare  
 vary: Origin, Accept-Encoding  
 x-firefox-spdy: h2 
 ```


### Device Metadata
| Field      | Value         |
|------------|---------------|
| Device     | Windows 10    |
| Dimensions | 1440x887      |
| ...        | ...           |
