# Sample tests for the rquests:
Please view the raw format for best results

### list of all books
`GET http://localhost:8080/bookinfo`

### Shows the info of one book by isbn
`GET http://localhost:8080/bookinfo/9780061120084`

### Adds a book to the database
`POST http://localhost:8080/bookinfo
Content-Type: application/json
{
  "isbn": 9780486282114,
  "book_name": "Frankenstein",
  "description": "The story of Victor Frankenstein's terrible creation and the havoc it caused.",
  "price": 5.99,
  "author": "Mary Shelley",
  "genre": "Horror",
  "publisher": "Dover Publications",
  "year_published": 1994,
  "copies_sold": 400000
}`

### list of all authors
`GET http://localhost:8080/authors`

### Adds an author to the database
`POST http://localhost:8080/authors
Content-Type: application/json
{
  "id": 6,
  "first_name": "George",
  "last_name": "Orwell",
  "biography": "Orwell is most famous for his dystopian works of fiction, Animal Farm and 1984.",
  "publisher": "Penguin"
}`

### Lists all books Associated with an Author via Author id
`GET http://localhost:8080/authors/6`
