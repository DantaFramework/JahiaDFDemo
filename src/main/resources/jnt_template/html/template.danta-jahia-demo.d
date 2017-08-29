<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

    <title>{% page.title %}</title>

    {%addResources "bootstrap.css" type="css" %}
    {%addResources "bootstrap-theme.css" type="css" %}
    {%addResources "justified-nav.css" type="css" %}

</head>

<body>
    <div class="container">
        {%includeArea "pagecontent" %}
    </div>
</body>
</html>
