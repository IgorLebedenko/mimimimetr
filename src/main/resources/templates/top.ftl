<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="/static/css/style.css"/>
    <title>Мимимиметр</title>
</head>
<body>
<h1>Мимимиметр</h1>
<h3>Топ 10</h3>
    <div class="top-list">
        <ol>
            <#list cats as cat>
                <li>
                    <img src="/img/${cat.filename}"/>
                    <span>${cat.name}</span>
                </li>
            </#list>
        </ol>
    </div>
</body>
</html>