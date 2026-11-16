package defpackage;

import android.view.Window;
import androidx.appcompat.app.AlertDialog;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.WindowInsetsControllerCompat;
import com.usercentrics.tcf.core.model.gvl.Vendor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ja1 extends ks0 implements zr0 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ja1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        List listZ0;
        Window window;
        int i = this.b;
        az2 az2Var = az2.a;
        boolean z = false;
        switch (i) {
            case 0:
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                int iIntValue = ((Number) obj2).intValue();
                serialDescriptor.getClass();
                ka1 ka1Var = (ka1) this.receiver;
                ka1Var.getClass();
                if (!serialDescriptor.i(iIntValue) && serialDescriptor.d(iIntValue).b()) {
                    z = true;
                }
                ka1Var.b = z;
                return Boolean.valueOf(z);
            case 1:
                mn2 mn2Var = (mn2) obj;
                mn2Var.getClass();
                ((it0) obj2).getClass();
                ((u82) this.receiver).getClass();
                return mn2Var;
            case 2:
                mn2 mn2Var2 = (mn2) obj;
                it0 it0Var = (it0) obj2;
                mn2Var2.getClass();
                it0Var.getClass();
                ((u82) this.receiver).getClass();
                e12 e12Var = mn2Var2.C;
                e12Var.getClass();
                if (e12Var.d == null) {
                    e12Var.d = it0Var;
                }
                mn2Var2.s.k(eu.z(1, 3, 4, 5, 6));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("legIntPurposes", mn2Var2.z);
                linkedHashMap.put("purposes", mn2Var2.y);
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str = (String) entry.getKey();
                    a53 a53Var = (a53) entry.getValue();
                    t82 t82Var = new t82(it0Var, a53Var, str, e12Var, mn2Var2);
                    for (int i2 = 1; i2 <= a53Var.b; i2++) {
                        t82Var.invoke(Boolean.valueOf(a53Var.c(i2)), Integer.valueOf(i2));
                    }
                }
                a53 a53Var2 = mn2Var2.A;
                Map map = it0Var.b;
                if (map != null) {
                    ArrayList arrayList = new ArrayList(map.size());
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((Vendor) ((Map.Entry) it.next()).getValue()).o));
                    }
                    listZ0 = du.z0(arrayList);
                } else {
                    listZ0 = null;
                }
                listZ0.getClass();
                a53Var2.e(listZ0);
                return mn2Var2;
            case 3:
                mv2.j((mv2) this.receiver, ((Number) obj).intValue(), ((Number) obj2).intValue());
                return az2Var;
            default:
                int iIntValue2 = ((Number) obj).intValue();
                int iIntValue3 = ((Number) obj2).intValue();
                AlertDialog alertDialog = ((m23) this.receiver).j;
                if (alertDialog != null && (window = alertDialog.getWindow()) != null) {
                    WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, window.getDecorView());
                    windowInsetsControllerCompat.c(ColorUtils.c(iIntValue2) > 0.5d);
                    windowInsetsControllerCompat.b(ColorUtils.c(iIntValue3) > 0.5d);
                }
                return az2Var;
        }
    }
}
