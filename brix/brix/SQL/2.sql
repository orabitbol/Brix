#2
SELECT p.CategoryiId,p.ProductName,p.price,c.name AS CategoryName
FROM categories AS c JOIN products AS p ON c.id=p.CategoryiId

