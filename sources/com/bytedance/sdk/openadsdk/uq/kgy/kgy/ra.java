package com.bytedance.sdk.openadsdk.uq.kgy.kgy;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class ra<D> extends com.bytedance.kgy.kgy<D> {
    private static final HashSet<String> kgy;

    static {
        HashSet<String> hashSet = new HashSet<>();
        kgy = hashSet;
        hashSet.add("play_start");
        hashSet.add("feed_play");
        hashSet.add("feed_continue");
        hashSet.add("feed_pause");
        hashSet.add("feed_break");
        hashSet.add("feed_over");
    }

    @Override // com.bytedance.kgy.kgy
    public final int yo() {
        if ((this instanceof twf) || ahm() == 1) {
            return 4;
        }
        boolean z = this instanceof gf;
        if (z) {
            if (kgy.contains(((gf) this).fi())) {
                return 3;
            }
        }
        return z ? 2 : 1;
    }

    public ra(String str, com.bytedance.kgy.kgy.InterfaceC0201kgy<D> interfaceC0201kgy) {
        super(str, (com.bytedance.kgy.kgy.InterfaceC0201kgy) interfaceC0201kgy);
    }

    public ra(String str, D d) {
        super(str, d);
    }
}
