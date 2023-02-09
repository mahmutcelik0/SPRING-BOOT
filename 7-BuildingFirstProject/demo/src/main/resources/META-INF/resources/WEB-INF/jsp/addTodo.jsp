<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!doctype html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport"
              content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Document</title>

        <link rel="stylesheet" href="webjars/bootstrap/5.2.3/css/bootstrap.min.css">
    </head>

    <body>
        <div class="container">
            <h2>ADD NEW TODO</h2>

            <form method="post">
                Description: <input type="text" name="description">
                <input type="submit" class="btn btn-success" value="ADD">
            </form>
        </div>

        <script src="webjars/jquery/3.6.2/jquery.min.js"></script>
        <script src="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>

    </body>
</html>

