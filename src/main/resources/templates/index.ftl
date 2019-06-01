<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Mimimimetr</title>
</head>
<body>
    <h3>Mimimimetr</h3>
    <#list cats as cat>
        <div>
            ${cat.id}
            ${cat.name}
            ${cat.filename}
            ${cat.votes}
        </div>
    </#list>
</body>
</html>