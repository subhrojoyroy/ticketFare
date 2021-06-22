API : http://localhost:8080/metro-rail/getFare/4578
Request Body :
[
	{
		"fromZone" : {"zoneId" : 1, "zoneName" : "A"},
		"toZone" : {"zoneId" : 2, "zoneName" : "B"},
		"fromTime" : "2021-06-21T09:35:00",
		"toTime" : "2021-06-21T10:25:00"
	},
	{
		"fromZone" : {"zoneId" : 2, "zoneName" : "B"},
		"toZone" : {"zoneId" : 1, "zoneName" : "A"},
		"fromTime" : "2021-06-21T17:15:00",
		"toTime" : "2021-06-21T18:05:00"
	}
]

Output : -1 (Prototype)
