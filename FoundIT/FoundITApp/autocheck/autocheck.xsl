<!-- This XSL extract AutoCheck result from a SOAP message -->
<!-- Running command: java -jar saxon9he.jar autocheck-soap.xml autocheck.xsl > autocheck-result.xml  -->
<!--    where autocheck-soap.xml is generated by FoundITAppServer/AutoCheckServlet -->
<!-- by Zenglin Wang -->

<xsl:stylesheet
     xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
     version="1.1">
<xsl:output method="text" omit-xml-declaration="yes" indent="no"/>

<xsl:template match="//result">
	<xsl:value-of select="."/>
</xsl:template>

</xsl:stylesheet>