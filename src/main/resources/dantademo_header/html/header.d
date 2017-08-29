<div class="masthead">
    <h3 class="text-muted">{% content.projectName %} </h3>
    <h4>{% content.greetingMessage %}</h4>
    <nav>
        <ul class="nav nav-justified">
            {%#each childrenList %}
                <li><a href="/cms/render/default/en{%this.link%}.html">{% this.name %}</a></li>
            {%/each%}
        </ul>
    </nav>
</div>
