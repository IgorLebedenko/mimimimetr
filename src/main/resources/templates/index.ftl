<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="/static/css/style.css"/>
    <title>Мимимиметр</title>
</head>
<body>
    <h1>Мимимиметр</h1>
    <h3>Кто из них мимимишнее? Кликни по фотографии!</h3>
    <#list cats as cat>
        <div>
            <img src="/img/${cat.filename}"/>
            ${cat.name}
        </div>
    </#list>
</body>
</html>