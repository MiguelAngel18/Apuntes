<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html>
    <head>
    </head>
    <body>
        <xsl:for-each select="//factura">
            <h2><xsl:value-of select="comprador"/></h2>
            <h3><xsl:value-of select="fecha"/></h3>
            <table border="1">
                <tr>
                    <td>
                        <p>Nombre</p>
                    </td>
                    <td>
                        <p>Nº Unidades</p>
                    </td>
                    <td>
                        <p>Precio</p>
                    </td>
                </tr>
                <xsl:for-each select="producto">
                    <tr>
                        <td><xsl:value-of select="nombre"/></td>
                        <td><xsl:value-of select="unidades"/></td>
                        <td><xsl:value-of select="precio"/></td>
                    </tr>
                </xsl:for-each>
            </table>
        </xsl:for-each>
    </body>
</html>
</xsl:template>
</xsl:stylesheet>