from pymongo import MongoClient

client = MongoClient("mongodb://localhost:27017/")
db = client["libraryDB"]
books = db["books"]

books.insert_many([
{
"book_id":101,
"title":"Data Structures",
"author":"Mark Allen",
"genre":"Computer Science",
"status":"Available"
},
{
"book_id":102,
"title":"Database Systems",
"author":"Henry Morris",
"genre":"Computer Science",
"status":"Available"
},
{
"book_id":103,
"title":"Python Basics",
"author":"John Smith",
"genre":"Programming",
"status":"Available"
}
])

print("Books inserted")

for book in books.find():
    print(book)