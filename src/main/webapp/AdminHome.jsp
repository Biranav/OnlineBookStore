<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Details </title>
<style>
 body {
           
            background-color: #f5f5f5;
            margin: 0;
            padding: 0;
        }

        .container {
            width: 80%;
            margin: 50px auto;
        }

        h1 {
            text-align: center;
            color: #333;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin: 20px 0;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        th, td {
            padding: 12px 15px;
            border: 1px solid #ddd;
            text-align: center;
        }

        th {
            background-color: #f2f2f2;
        }

        button {
            padding: 8px 12px;
            border: none;
            cursor: pointer;
            font-size: 14px;
        }

        .edit-btn {
            background-color: #4CAF50;
            color: white;
        }

        .delete-btn {
            background-color: #f44336;
            color: white;
        }

        .add-btn {
            display: inline-block;
            margin: 20px 0;
            padding: 10px 20px;
            background-color: #008CBA;
            color: white;
            text-align: center;
            font-size: 16px;
            text-decoration: none;
            border-radius: 5px;
        }

        .add-btn:hover {
            background-color: #006f99;
        }

        button:hover {
            opacity: 0.8;
        }
</style>
</head>

<body>
 <div class="container">
        <h1>Book List</h1>
        <a href="BookDetails.html" class="add-btn">Add Book</a>
        <br>
        <table>
            <thead>
                <tr>
                    <th>Book Title</th>
                    <th>Author</th>
                    <th>Owner Contact</th>
                    <th>Genre</th>
                    <th>Price</th>
                    <th>Edit/Delete</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                   <!--  <td>The Great Gatsby</td>
                    <td>F. Scott Fitzgerald</td>
                    <td>1925</td>
                    <td>
                        <button class="edit-btn">Edit</button>
                        <button class="delete-btn">Delete</button>
                    </td> --> 
                </tr>     
            </tbody>
        </table>
    </div>

</body>
</html>