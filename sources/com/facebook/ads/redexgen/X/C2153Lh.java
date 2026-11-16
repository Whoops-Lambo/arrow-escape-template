package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C2153Lh implements InterfaceC2801ei, InterfaceC2805en {
    public static byte[] A0C;
    public static String[] A0D = {"OTBhn", "woE0GsYsDC", "jJJsRhZ6eh", "RbmDZKGZyk", "MbYnCV2deeCvNEpfUSPgn7RvJuamywdV", "va4Mi1JJiq4w08mNkhVxy34L1bzftr4W", "QQZqW8pW387BdDH3gcXSwYVoWAeaIxNz", "E72k8"};
    public static final String A0E;
    public int A00;
    public LK A01;
    public InterfaceC2820f2 A02;
    public C2821f3 A03;
    public InterfaceC3348nh A04;
    public List<GT> A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final C2055Hi A0A;
    public final String A0B;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 106);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{124, 89, 92, 77, 73, 88, 79, 29, 92, 81, 79, 88, 92, 89, 68, 29, 81, 82, 92, 89, 88, 89, 29, 89, 92, 73, 92, 93, 114, 119, 125, 117, 62, 118, 127, 110, 110, 123, 112, 123, 122, 62, 113, 112, 62, 114, 113, 125, 117, 109, 125, 108, 123, 123, 112, 62, 127, 122, 104, 71, 66, 72, 64, 11, 71, 68, 76, 76, 78, 79, 10, 26, 7, 31, 27, 13, 26, 55, 28, 17, 24, 13, 64, 66, 79, 79, 70, 81, 119, 90, 83, 70, 54, 52, 39, 49, 54, 59, 33, 92, 94, 77, 91, 86, 81, 91, 32, 32, 55, 28, 55, 58, 51, 38, 87, 64, 82, 93, 72, 85, 74, 89, 17, 12, 3, 18, 17, 10, 13, 22, 93, 70, 65, 89, 93, 77, 97, 76, 20, 11, 7, 21};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A06(Map<String, String> map, Map<String, String> map2) {
        try {
            new Handler().postDelayed(new C2155Lj(this, map2, A03(map)), this.A01.A09() * 1000);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00dd  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final void A0M(Map<String, String> map) {
        if (A0R()) {
            if (C3300mv.A26(this.A0A) && C3524qd.A03(map)) {
                String str = A0E;
                if (A0D[4].charAt(15) == 'f') {
                    A0D[6] = "D3JUlaax70Z19DqZX7Vx94n8SobUQcIP";
                    Log.e(str, A02(27, 31, 116));
                    return;
                }
            } else {
                HashMap map2 = new HashMap();
                if (map != null) {
                    map2.putAll(map);
                }
                if (this.A01.A0j()) {
                    map2.put(A02(99, 7, 85), String.valueOf(A0E().A04()));
                    map2.put(A02(92, 7, 63), String.valueOf(A0E().A03()));
                }
                map2.put(A02(82, 10, 73), AdPlacementType.NATIVE.name());
                map2.put(A02(130, 8, 66), this.A0B);
                String strA1V = this.A01.A0F() != null ? this.A01.A0F().A1V() : null;
                if (strA1V != null) {
                    map2.put(A02(70, 12, 2), strA1V);
                }
                String strA1W = this.A01.A0F() != null ? this.A01.A0F().A1W() : null;
                String[] strArr = A0D;
                if (strArr[0].length() == strArr[7].length()) {
                    A0D[2] = "05GUJTBpuf";
                    if (strA1W != null) {
                        map2.put(A02(106, 8, 41), strA1W);
                    }
                } else if (strA1W != null) {
                    map2.put(A02(106, 8, 41), strA1W);
                }
                AbstractC2798ef abstractC2798efA00 = C2799eg.A00(this.A0A, this.A0A.A0A(), this.A01.A7z(), this.A01.A0E(), map2, this.A01.A0F() != null ? this.A01.A0F().A33() : null);
                EnumC2795ec enumC2795ecA0G = EnumC2795ec.A08;
                if (abstractC2798efA00 != null) {
                    enumC2795ecA0G = abstractC2798efA00.A0G(null);
                }
                if (enumC2795ecA0G == EnumC2795ec.A05) {
                    return;
                }
                AbstractC3455pW.A04(this.A0A, A02(58, 12, 65));
                if (this.A02 == null) {
                    return;
                }
                InterfaceC2820f2 interfaceC2820f2 = this.A02;
                if (A0D[2].length() == 10) {
                    A0D[5] = "IfczvUCKZEGqvj8t95lX03j8qUuki18q";
                    interfaceC2820f2.AFz(this);
                    return;
                }
            }
            throw new RuntimeException();
        }
    }

    static {
        A04();
        A0E = C2153Lh.class.getSimpleName();
    }

    public C2153Lh(C2055Hi c2055Hi) {
        this(c2055Hi, new LK());
    }

    public C2153Lh(C2055Hi c2055Hi, LK lk) {
        this.A0B = UUID.randomUUID().toString();
        this.A00 = 200;
        this.A01 = lk;
        this.A0A = c2055Hi;
    }

    private Map<String, String> A03(Map<String, String> map) {
        HashMap map2 = new HashMap();
        String strA02 = A02(138, 4, 8);
        if (map.containsKey(strA02)) {
            map2.put(strA02, map.get(strA02));
        }
        String strA03 = A02(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 8, 8);
        if (map.containsKey(strA03)) {
            map2.put(strA03, map.get(strA03));
        }
        return map2;
    }

    private void A05(LK lk) {
        if (!this.A06) {
            this.A01 = lk;
            List<LK> listA0f = this.A01.A0f();
            if (listA0f != null && listA0f.size() > 0) {
                int size = listA0f.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    C2153Lh adapter = new C2153Lh(this.A0A);
                    adapter.A05(listA0f.get(i));
                    arrayList.add(new GT(this.A0A, adapter, (C3243lz) null, this.A04));
                }
                this.A05 = arrayList;
            }
            this.A06 = true;
            this.A07 = A07();
            return;
        }
        throw new IllegalStateException(A02(0, 27, 87));
    }

    private boolean A07() {
        if (((!this.A01.A0j() && !TextUtils.isEmpty(this.A01.A0Y())) || (!TextUtils.isEmpty(this.A01.A0V()) && this.A01.A0j())) && (this.A01.A0I() != null || this.A01.A0j())) {
            C3349ni c3349niA0H = this.A01.A0H();
            if (A0D[2].length() != 10) {
                throw new RuntimeException();
            }
            A0D[6] = "coz4LHwVNN2LSDndRSBnj9WvwXuRM5HO";
            if (c3349niA0H != null || A9N() == AdPlacementType.NATIVE_BANNER) {
                return true;
            }
        }
        return false;
    }

    public final int A08() {
        return this.A01.A02();
    }

    public final int A09() {
        return this.A01.A05();
    }

    public final int A0A() {
        int iA08 = this.A01.A08();
        if (iA08 < 0 || iA08 > 100) {
            return 0;
        }
        return iA08;
    }

    public final int A0B() {
        return this.A00;
    }

    public final int A0C() {
        return this.A01.A0B();
    }

    public final int A0D() {
        return this.A01.A0C();
    }

    public final LK A0E() {
        return this.A01;
    }

    public final InterfaceC2820f2 A0F() {
        return this.A02;
    }

    public final String A0G() {
        return this.A01.A0b();
    }

    public final List<GT> A0H() {
        if (!A0R()) {
            return null;
        }
        return this.A05;
    }

    public final void A0I() {
        if (!this.A09) {
            String strA0c = A0E().A0c();
            if (A0D[2].length() != 10) {
                throw new RuntimeException();
            }
            A0D[5] = "8ArINtb0xmmgo9NmELWQk3NiIhKYvaDc";
            if (strA0c != null) {
                this.A0A.A0A().AIC(strA0c);
            }
            this.A09 = true;
        }
    }

    public final void A0J() {
        Iterator<GT> it;
        if (this.A05 == null) {
            return;
        }
        boolean zIsEmpty = this.A05.isEmpty();
        if (A0D[6].charAt(13) != 'D') {
            throw new RuntimeException();
        }
        A0D[6] = "kj4WnsmCok25qDrlf1kxSYggARLvW33C";
        if (!zIsEmpty) {
            List<GT> list = this.A05;
            if (A0D[2].length() != 10) {
                it = list.iterator();
            } else {
                A0D[2] = "wGXHpE1nya";
                it = list.iterator();
            }
            while (true) {
                boolean zHasNext = it.hasNext();
                if (A0D[2].length() != 10) {
                    A0D[6] = "0lb5BUzW8n1EJDWyWAqaA7d0lZJNpkzV";
                    if (!zHasNext) {
                        return;
                    }
                } else {
                    A0D[5] = "QJQdkpg5cmGOeaue26HVF3aLtsB2qwfM";
                    if (!zHasNext) {
                        return;
                    }
                }
                it.next().unregisterView();
            }
        }
    }

    public final void A0K(InterfaceC2820f2 interfaceC2820f2) {
        this.A02 = interfaceC2820f2;
    }

    public final void A0L(C2055Hi c2055Hi, InterfaceC2820f2 interfaceC2820f2, InterfaceC3321nG interfaceC3321nG, C2879fz c2879fz, InterfaceC3348nh interfaceC3348nh) {
        int iA06;
        this.A02 = interfaceC2820f2;
        this.A04 = interfaceC3348nh;
        JSONObject jSONObjectA03 = c2879fz.A03();
        C3243lz c3243lzA01 = c2879fz.A01();
        if (c3243lzA01 != null) {
            iA06 = c3243lzA01.A06();
        } else {
            iA06 = 200;
        }
        this.A00 = iA06;
        A05(AbstractC2822f4.A00(c2055Hi, jSONObjectA03, AbstractC3489q4.A02(jSONObjectA03, A02(Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, 2, 94))));
        if (AbstractC2802ej.A06(c2055Hi, this, interfaceC3321nG)) {
            c2055Hi.A0F().A5b();
            interfaceC2820f2.AG3(this, C3359nt.A00(AdErrorType.NO_FILL));
        } else {
            if (interfaceC2820f2 != null) {
                interfaceC2820f2.AG0(this);
            }
            this.A03 = new C2821f3(c2055Hi, this.A0B, this, interfaceC2820f2);
            this.A03.A02();
        }
    }

    public final void A0N(Map<String, String> extraData) {
        this.A0A.A0A().ABr(this.A01.A7z(), extraData);
    }

    public final void A0O(Map<String, String> map) {
        if (A0R() && !this.A08) {
            if (this.A02 != null) {
                this.A02.AG1(this);
            }
            HashMap map2 = new HashMap();
            if (map != null) {
                map2.putAll(map);
            }
            if (this.A01.A0j()) {
                map2.put(A02(99, 7, 85), String.valueOf(A0E().A04()));
                map2.put(A02(92, 7, 63), String.valueOf(A0E().A03()));
            }
            if (!TextUtils.isEmpty(A7z())) {
                if (!this.A01.A0j()) {
                    this.A0A.A0F().A3h();
                    AbstractC2910gU.A02(this.A01.A0a(), AbstractC3498qD.A00(A02(116, 6, 86)));
                }
                this.A0A.A0A().AC7(A7z(), map2);
                C3425oz.A00(this.A0A).A0E(AdPlacementType.NATIVE.toString(), A7z());
            }
            if (A0T() || A0U()) {
                A06(map, map2);
            }
            this.A08 = true;
        }
    }

    public final boolean A0P() {
        return true;
    }

    public final boolean A0Q() {
        return A0R() && this.A01.A0E() != null;
    }

    public final boolean A0R() {
        return this.A06 && this.A07;
    }

    public final boolean A0S() {
        return this.A01.A0i();
    }

    public final boolean A0T() {
        if (C3300mv.A1b(this.A0A) && A0R()) {
            boolean zA0k = this.A01.A0k();
            if (A0D[4].charAt(15) != 'f') {
                throw new RuntimeException();
            }
            A0D[6] = "hsrOxssvGH6abDOIeI9T6FJFSNjQSl4a";
            if (zA0k) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0U() {
        if (C3300mv.A1b(this.A0A) && A0R()) {
            boolean zA0l = this.A01.A0l();
            String[] strArr = A0D;
            if (strArr[0].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A0D[2] = "qputmJyOXU";
            if (zA0l) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2801ei
    public final String A7z() {
        return this.A01.A7z();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2801ei
    public final Collection<String> A8Q() {
        return A0E().A8Q();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2801ei
    public final EnumC2800eh A8w() {
        return A0E().A8w();
    }

    public AdPlacementType A9N() {
        return AdPlacementType.NATIVE;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2805en
    public final boolean ALe() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2805en
    public final void onDestroy() {
        if (this.A03 != null) {
            this.A03.A03();
        }
    }
}
