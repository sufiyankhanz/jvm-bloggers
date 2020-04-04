package com.jvm_bloggers;

/**
 * UTM (Urchin Traffic Monitor) URL query parameter identifiers.
 *
 * @see <a href="https://en.wikipedia.org/wiki/UTM_parameters">UTM Parameters</a>
 * @author cslysy &lt;jakub.sprega@gmail.com&gt;
 */
public class UtmParams {

    private UtmParams() {
        throw new IllegalStateException("Utility class");
    }

    public static final String UTM_SOURCE_KEY = "utm_source";

    public static final String UTM_MEDIUM_KEY = "utm_medium";

    public static final String UTM_CAMPAIGN_KEY = "utm_campaign";
}
