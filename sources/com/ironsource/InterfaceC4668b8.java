package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.b8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC4668b8<T> {
    T a(@NotNull String str);

    void a(T t);

    void a(@NotNull String str, T t);

    /* JADX INFO: renamed from: com.ironsource.b8$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a implements InterfaceC4668b8<ISDemandOnlyInterstitialListener> {

        @NotNull
        private C4594a8 a = new C4594a8();

        @NotNull
        private final Map<String, C4594a8> b = new HashMap();

        @Override // com.ironsource.InterfaceC4668b8
        public void a(@NotNull ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            iSDemandOnlyInterstitialListener.getClass();
            this.a.a(iSDemandOnlyInterstitialListener);
            Iterator<String> it = this.b.keySet().iterator();
            while (it.hasNext()) {
                C4594a8 c4594a8 = this.b.get(it.next());
                if (c4594a8 != null) {
                    c4594a8.a(iSDemandOnlyInterstitialListener);
                }
            }
        }

        @Override // com.ironsource.InterfaceC4668b8
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ISDemandOnlyInterstitialListener a(@NotNull String str) {
            str.getClass();
            C4594a8 c4594a8 = this.b.get(str);
            if (c4594a8 != null) {
                return c4594a8;
            }
            return this.a;
        }

        @Override // com.ironsource.InterfaceC4668b8
        public void a(@NotNull String str, @NotNull ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            str.getClass();
            iSDemandOnlyInterstitialListener.getClass();
            boolean zContainsKey = this.b.containsKey(str);
            Map<String, C4594a8> map = this.b;
            if (zContainsKey) {
                C4594a8 c4594a8 = map.get(str);
                if (c4594a8 != null) {
                    c4594a8.a(iSDemandOnlyInterstitialListener);
                    return;
                }
                return;
            }
            map.put(str, new C4594a8(iSDemandOnlyInterstitialListener));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.b8$b */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class b implements InterfaceC4668b8<ISDemandOnlyRewardedVideoListener> {

        @NotNull
        private C4704d8 a = new C4704d8();

        @NotNull
        private final Map<String, C4704d8> b = new HashMap();

        @Override // com.ironsource.InterfaceC4668b8
        public void a(@NotNull ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            iSDemandOnlyRewardedVideoListener.getClass();
            this.a.a(iSDemandOnlyRewardedVideoListener);
            Iterator<String> it = this.b.keySet().iterator();
            while (it.hasNext()) {
                C4704d8 c4704d8 = this.b.get(it.next());
                if (c4704d8 != null) {
                    c4704d8.a(iSDemandOnlyRewardedVideoListener);
                }
            }
        }

        @Override // com.ironsource.InterfaceC4668b8
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ISDemandOnlyRewardedVideoListener a(@NotNull String str) {
            str.getClass();
            C4704d8 c4704d8 = this.b.get(str);
            if (c4704d8 != null) {
                return c4704d8;
            }
            return this.a;
        }

        @Override // com.ironsource.InterfaceC4668b8
        public void a(@NotNull String str, @NotNull ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            str.getClass();
            iSDemandOnlyRewardedVideoListener.getClass();
            boolean zContainsKey = this.b.containsKey(str);
            Map<String, C4704d8> map = this.b;
            if (zContainsKey) {
                C4704d8 c4704d8 = map.get(str);
                if (c4704d8 != null) {
                    c4704d8.a(iSDemandOnlyRewardedVideoListener);
                    return;
                }
                return;
            }
            map.put(str, new C4704d8(iSDemandOnlyRewardedVideoListener));
        }
    }
}
