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
    <div id="container">
        <form action="/?page=${page + 1}" method="post">
            <#list cats.pageList as cat>
                <button class="frame-btn" name="id" value="${cat.id}">
                    <img src="/img/${cat.filename}"/>
                    <span class="caption">${cat.name}</span>
                </button>
            </#list>
        </form>
    </div>
</body>
</html>