---
name: "\U0001F41B 500 Internal Server Error"
about: 'SYS-ERR '
title: ''
labels: 'type/bug'
assignees: 'Equpo Backend'
---

### Steps to reproduce
1. Abrir el navagador
2. Ir la la URL 'https://echo-serv.tbxnet.com/v1/qa/test2'
2. 

### Expected behavior
El codigo estatus es un 200
y los datos del response tendrian el siguiente esquema
{
    "ok": true,
    "date": "2023-04-25T23:37:56.119Z"
}

### Actual behavior
El servidor nos muestra un codigo de estatus 500
con el siguiente esquema
{
    "code": "SYS-ERR",
    "message": "An Error",
    "details": "An Error",
    "status": 500
}

### Environment
URL: <url goes here> 'https://echo-serv.tbxnet.com/v1/qa/test2'
Stage: <qa>

<link to screenshot or video>

### Logs
Response body:
'{
    "code": "SYS-ERR",
    "message": "An Error",
    "details": "An Error",
    "status": 500
}'

Response headers:
'
 cf-cache-status: DYNAMIC  
 cf-ray: 7bd9ff6dca5f02ce-MIA  
 content-length: 73  
 content-type: application/json; charset=utf-8  
 date: Tue, 25 Apr 2023 22:24:43 GMT  
 etag: W/"49-ArYeecwz7A1vE9c4IF/dQ6Ufivc"  
 server: cloudflare  
 vary: Origin, Accept-Encoding  
 x-firefox-spdy: h2 
 '

### Network Requests
<paste output from network requests tab here>

### Browser Metadata
| Field      | Value         |
|------------|---------------|
| Browser    | Chrome        |
| Version    | 86.0.4240.198 |
| Dimensions | 1440x887      |
| ...        | ...           |

### Device Metadata
| Field      | Value         |
|------------|---------------|
| Device     | Macbook Pro   |
| Dimensions | 1440x887      |
| ...        | ...           |

### User Data
| Field      | Value                                                         |
|------------|---------------------------------------------------------------|
| Id         | 1Vm7Va                                                        |
| Local Time | Thu Nov 19 2020 20:11:04 GMT-0700 (Mountain Standard Time)    |
| ...        | ...                                                           |

### Custom Data
| Field      | Value         |
|------------|---------------|
| ...        | ...           |