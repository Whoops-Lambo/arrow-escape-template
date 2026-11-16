package io.p071bidmachine.analytics.internal.p078g;

import io.p071bidmachine.ads.networks.adaptiverendering.e;
import io.p071bidmachine.analytics.ReaderConfig;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class f {
    public static final e.a a(ReaderConfig.Rule rule) {
        if (rule instanceof ReaderConfig.Rule.GeneralRule) {
            ReaderConfig.Rule.GeneralRule generalRule = (ReaderConfig.Rule.GeneralRule) rule;
            return new e.a.C1581a(generalRule.getTag(), generalRule.getPath());
        }
        if (rule instanceof ReaderConfig.Rule.PurRule) {
            ReaderConfig.Rule.PurRule purRule = (ReaderConfig.Rule.PurRule) rule;
            return new e.a.b(purRule.getTag(), purRule.getPath(), purRule.getQuery(), purRule.getShouldReport());
        }
        e.b();
        return null;
    }
}
