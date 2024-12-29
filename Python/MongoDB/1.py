from pymongo import MongoClient

client = MongoClient("mongodb://localhost:27017/")
db=client["test_db"]
collection=db["student"]
# collection.insert_many([{"name":"Nithesh","age":19,"grade":"O"},
# {"name":"Nidhi","age":19,"grade":"O"},
# {"name":"Nidhii","age":19,"grade":"O"}])
result=collection.find({"grade":"O"})
for i in result:
    print(i)