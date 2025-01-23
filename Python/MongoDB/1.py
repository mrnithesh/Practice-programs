from pymongo import MongoClient

client = MongoClient("mongodb://localhost:27017/")
db=client["test_db"]
collection=db["student"]

#create
# collection.insert_many([{"name":"Nithesh","age":19,"grade":"O"},
# {"name":"Nidhi","age":19,"grade":"O"},
# {"name":"Nidhii","age":19,"grade":"O"}])

#read
# result=collection.find({"grade":"O"})
# for i in result:
#     print(i)

#update
#collection.update_one({"name":"Nidhi"},{"$set":{"age":20}})

#delete
#collection.delete_many({"grade":"O"})

#querying
# results= collection.find({"age":{"$gt":18}})
# results=collection.find().sort("age",-1).limit(1)
# for i in results:
#     print(i)

# count=collection.count_documents({})
# print(count)

#distinct
# distinct_count=collection.distinct("name")
# print(distinct_count)

collection.update_many({"grade":"O"},{"$set":{"passed":True}})
