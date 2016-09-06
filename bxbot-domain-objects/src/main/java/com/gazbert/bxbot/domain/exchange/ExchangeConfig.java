/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2016 Gareth Jon Lynch
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.gazbert.bxbot.domain.exchange;

import com.google.common.base.MoreObjects;

/**
 * Domain object representing the overall Exchange config.
 *
 * @author gazbert
 */
public class ExchangeConfig {

    private String exchangeName;
    private String exchangeAdapter;
    private AuthenticationConfig authenticationConfig;

    private NetworkConfig networkConfig;
    private OtherConfig otherConfig;


    public String getExchangeName() {
        return exchangeName;
    }

    public void setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
    }

    public String getExchangeAdapter() {
        return exchangeAdapter;
    }

    public void setExchangeAdapter(String exchangeAdapter) {
        this.exchangeAdapter = exchangeAdapter;
    }

    public AuthenticationConfig getAuthenticationConfig() {
        return authenticationConfig;
    }

    public void setAuthenticationConfig(AuthenticationConfig authenticationConfig) {
        this.authenticationConfig = authenticationConfig;
    }

    public void setNetworkConfig(NetworkConfig networkConfig) {
        this.networkConfig = networkConfig;
    }

    public NetworkConfig getNetworkConfig() {
        return networkConfig;
    }

    public OtherConfig getOtherConfig() {
        return otherConfig;
    }

    public void setOtherConfig(OtherConfig otherConfig) {
        this.otherConfig = otherConfig;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("exchangeName", exchangeName)
                .add("exchangeAdapter", exchangeAdapter)
                // WARNING - careful showing this!
                //.add("authenticationConfig", authenticationConfig)
                .add("networkConfig", networkConfig)
                .add("otherConfig", otherConfig)
                .toString();
    }
}
