
POST: http://localhost:8080/getInfo
1st Customr:
{
        "id": 1,
        "name": "Satish",
        "email": "sat@sap.com",
        "gender": "male",
        "products": [
            {
                "pid": 201,
                "productName": "Mobile",
                "qty": 1,
                "price": 10000
            },
            {
                "pid": 399,
                "productName": "Laptop",
                "qty": 3,
                "price": 30000
            }
        ]
    }

2nd Customr:
{
	"customer":{
		"name": "MsDhoni",
		"email": "ms@crickinfo.com",
		"gender": "male",
		"products":[
			{
				"pid":297,
				"productName": "Watch",
				"price": 10000,
				"qty": 2
			},
			{
				"pid":286,
				"productName": "Clothes",
				"price": 5000,
				"qty": 2
			}
			]
	}
}




GET: http://localhost:8080/findAllOrders
[
    {
        "id": 1,
        "name": "Satish",
        "email": "sat@sap.com",
        "gender": "male",
        "products": [
            {
                "pid": 201,
                "productName": "Mobile",
                "qty": 1,
                "price": 10000
            },
            {
                "pid": 399,
                "productName": "Laptop",
                "qty": 3,
                "price": 30000
            }
        ]
    },
    {
        "id": 2,
        "name": "MsDhoni",
        "email": "ms@crickinfo.com",
        "gender": "male",
        "products": [
            {
                "pid": 297,
                "productName": "Watch",
                "qty": 2,
                "price": 10000
            },
            {
                "pid": 286,
                "productName": "Clothes",
                "qty": 2,
                "price": 5000
            }
        ]
    }
]



GET: http://localhost:8080/getInfo
[
    {
        "name": "Satish",
        "productName": "Mobile"
    },
    {
        "name": "Satish",
        "productName": "Laptop"
    },
    {
        "name": "MsDhoni",
        "productName": "Watch"
    },
    {
        "name": "MsDhoni",
        "productName": "Clothes"
    }
]