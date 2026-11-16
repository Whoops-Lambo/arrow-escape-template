package com.adsurge.adn.C;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements c {
    public static final a c;
    public static final /* synthetic */ a[] d = b();
    public final String a;
    public final d b;

    static {
        String str = "RECORD_EVENT";
        c = new a(str, 0, "EFFECT_RECORD_EVENT", d.CURRENT) { // from class: com.adsurge.adn.C.a.a
            @Override // com.adsurge.adn.C.c
            public void a(JSONObject jSONObject, com.adsurge.adn.u1.c cVar) {
                int iOptInt = jSONObject.optInt("eventId", 0);
                if (iOptInt <= 0) {
                    return;
                }
                Integer numValueOf = jSONObject.has("enumCode") ? Integer.valueOf(jSONObject.optInt("enumCode")) : null;
                Integer numValueOf2 = jSONObject.has(IronSourceConstants.EVENTS_ERROR_CODE) ? Integer.valueOf(jSONObject.optInt(IronSourceConstants.EVENTS_ERROR_CODE)) : null;
                Integer numValueOf3 = jSONObject.has("duration1") ? Integer.valueOf(jSONObject.optInt("duration1")) : null;
                Integer numValueOf4 = jSONObject.has("duration2") ? Integer.valueOf(jSONObject.optInt("duration2")) : null;
                boolean zOptBoolean = jSONObject.optBoolean("immediately", false);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("devExtra");
                com.adsurge.adn.w1.b.a(iOptInt, cVar != null ? com.adsurge.adn.Y0.c.a(cVar) : null, numValueOf, numValueOf2, (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.length() <= 0) ? null : new com.adsurge.adn.Y0.d(jSONObjectOptJSONObject), zOptBoolean, numValueOf3, numValueOf4);
            }
        };
    }

    public static /* synthetic */ a[] b() {
        return new a[]{c};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) d.clone();
    }

    @Override // com.adsurge.adn.C.c
    public d a() {
        return this.b;
    }

    public a(String str, int i, String str2, d dVar) {
        super(str, i);
        this.a = str2;
        this.b = dVar;
    }
}
