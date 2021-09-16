<!DOCTYPE html>
<head>
</head>
<body>

  <h1>HelloApp: ${pageTitle}</h1>

  <p>Say hello to someone...</p>

  <form action='hello' method='POST'>
    <label for='name'>Name:</label>
    <input name='name' placeholder='Enter a name...' />
    <button type='submit'>Say hello</button>
  </form>

  <#if names??>
    <ol>
    <#list names as n>
      <li>${n}</li>
    </#list>
    <ol>
  </#if>

</body>
</html>
