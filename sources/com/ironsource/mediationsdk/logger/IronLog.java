package com.ironsource.mediationsdk.logger;

import com.ironsource.C4797ib;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public enum IronLog {
    API(IronSourceLogger.IronSourceTag.API),
    CALLBACK(IronSourceLogger.IronSourceTag.CALLBACK),
    ADAPTER_API(IronSourceLogger.IronSourceTag.ADAPTER_API),
    ADAPTER_CALLBACK(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK),
    NETWORK(IronSourceLogger.IronSourceTag.NETWORK),
    INTERNAL(IronSourceLogger.IronSourceTag.INTERNAL),
    NATIVE(IronSourceLogger.IronSourceTag.NATIVE),
    EVENT(IronSourceLogger.IronSourceTag.EVENT);

    IronSourceLogger.IronSourceTag a;

    IronLog(IronSourceLogger.IronSourceTag ironSourceTag) {
        this.a = ironSourceTag;
    }

    public void error() {
        IronSourceLoggerManager.getLogger().a(this.a, new C4797ib("", 3));
    }

    public void general() {
        IronSourceLoggerManager.getLogger().a(this.a, new C4797ib("", 4));
    }

    public void info() {
        IronSourceLoggerManager.getLogger().a(this.a, new C4797ib("", 1));
    }

    public void verbose() {
        IronSourceLoggerManager.getLogger().a(this.a, new C4797ib("", 0));
    }

    public void warning() {
        IronSourceLoggerManager.getLogger().a(this.a, new C4797ib("", 2));
    }

    public void error(String str) {
        IronSourceLoggerManager.getLogger().a(this.a, new C4797ib(str, 3));
    }

    public void general(String str) {
        IronSourceLoggerManager.getLogger().a(this.a, new C4797ib(str, 4));
    }

    public void info(String str) {
        IronSourceLoggerManager.getLogger().a(this.a, new C4797ib(str, 1));
    }

    public void verbose(String str) {
        IronSourceLoggerManager.getLogger().a(this.a, new C4797ib(str, 0));
    }

    public void warning(String str) {
        IronSourceLoggerManager.getLogger().a(this.a, new C4797ib(str, 2));
    }

    public void error(String str, Throwable th) {
        IronSourceLoggerManager.getLogger().a(this.a, new C4797ib(str, 3), th);
    }
}
