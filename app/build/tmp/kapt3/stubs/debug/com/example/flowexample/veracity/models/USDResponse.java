package com.example.flowexample.veracity.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bH\u00c6\u0003JE\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\t\u0010#\u001a\u00020\u0003H\u00d6\u0001R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r\u00a8\u0006$"}, d2 = {"Lcom/example/flowexample/veracity/models/USDResponse;", "", "result", "", "provider", "terms_of_use", "base_code", "rates", "Lcom/example/flowexample/veracity/models/USDRates;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/flowexample/veracity/models/USDRates;)V", "getBase_code", "()Ljava/lang/String;", "setBase_code", "(Ljava/lang/String;)V", "getProvider", "setProvider", "getRates", "()Lcom/example/flowexample/veracity/models/USDRates;", "setRates", "(Lcom/example/flowexample/veracity/models/USDRates;)V", "getResult", "setResult", "getTerms_of_use", "setTerms_of_use", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class USDResponse {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "result")
    private java.lang.String result;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "provider")
    private java.lang.String provider;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "terms_of_use")
    private java.lang.String terms_of_use;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "base_code")
    private java.lang.String base_code;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "rates")
    private com.example.flowexample.veracity.models.USDRates rates;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.flowexample.veracity.models.USDResponse copy(@org.jetbrains.annotations.Nullable()
    java.lang.String result, @org.jetbrains.annotations.Nullable()
    java.lang.String provider, @org.jetbrains.annotations.Nullable()
    java.lang.String terms_of_use, @org.jetbrains.annotations.Nullable()
    java.lang.String base_code, @org.jetbrains.annotations.Nullable()
    com.example.flowexample.veracity.models.USDRates rates) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public USDResponse(@org.jetbrains.annotations.Nullable()
    java.lang.String result, @org.jetbrains.annotations.Nullable()
    java.lang.String provider, @org.jetbrains.annotations.Nullable()
    java.lang.String terms_of_use, @org.jetbrains.annotations.Nullable()
    java.lang.String base_code, @org.jetbrains.annotations.Nullable()
    com.example.flowexample.veracity.models.USDRates rates) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getResult() {
        return null;
    }
    
    public final void setResult(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProvider() {
        return null;
    }
    
    public final void setProvider(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTerms_of_use() {
        return null;
    }
    
    public final void setTerms_of_use(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBase_code() {
        return null;
    }
    
    public final void setBase_code(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.flowexample.veracity.models.USDRates component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.flowexample.veracity.models.USDRates getRates() {
        return null;
    }
    
    public final void setRates(@org.jetbrains.annotations.Nullable()
    com.example.flowexample.veracity.models.USDRates p0) {
    }
}