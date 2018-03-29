package org.apereo.cas.configuration.model.support.pac4j;

import java.util.List;
import java.util.Map;

/**
 * This is {@link Pac4jSamlExtensionProperties}.
 *
 * @author Luis Faria
 * @since 5.?
 */
public class Pac4jSamlExtensionProperties {

    /**
     * The extension XML element namespace URI
     */
    private String namespaceURL;

    /**
     * The extension XML element namespace prefix
     */
    private String namespacePrefix;

    /**
     * The extension XML element name
     */
    private String name;

    /**
     * The extension XML element attributes as a key-value pair where
     * the key will be the attribute name (that must be a QName)
     * and the value is the value of attribute.
     */
    private Map<String, String> attributes;

    /**
     * A list of sub-elements.
     */
    private List<Pac4jSamlExtensionProperties> elements;

    /**
     * The extension XML element text content
     */
    private String textContent;

    public String getNamespaceURL() {
        return namespaceURL;
    }

    public void setNamespaceURL(String namespaceURL) {
        this.namespaceURL = namespaceURL;
    }

    public String getNamespacePrefix() {
        return namespacePrefix;
    }

    public void setNamespacePrefix(String namespacePrefix) {
        this.namespacePrefix = namespacePrefix;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public List<Pac4jSamlExtensionProperties> getElements() {
        return elements;
    }

    public void setElements(List<Pac4jSamlExtensionProperties> elements) {
        this.elements = elements;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }
}
