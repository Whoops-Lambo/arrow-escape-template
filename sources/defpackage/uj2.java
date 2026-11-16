package defpackage;

import android.app.ActivityManager;
import android.app.ApplicationStartInfo;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.internal.ads.zzagp;
import com.google.android.gms.internal.ads.zzat;
import com.google.android.gms.internal.ads.zzeh;
import com.google.android.gms.internal.ads.zzet;
import com.google.android.gms.internal.ads.zzey;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.fido.zzgx;
import com.lessmore.arrows.profiling.StartupLifecycleProvider;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class uj2 {
    public static final xb2 a = new xb2(11);
    public static final byte[] b = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};
    public static final byte[] c = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};
    public static boolean d;

    public static final Object n(t72 t72Var, boolean z, t72 t72Var2, zr0 zr0Var) {
        Object kvVar;
        Object objN;
        try {
            if (zr0Var instanceof ph) {
                os2.j(2, zr0Var);
                kvVar = zr0Var.invoke(t72Var2, t72Var);
            } else {
                kvVar = kc2.y(zr0Var, t72Var2, t72Var);
            }
        } catch (nc0 e) {
            t72Var.M(new kv(e.getCause(), false));
            throw e.getCause();
        } catch (Throwable th) {
            kvVar = new kv(th, false);
        }
        dz dzVar = dz.a;
        if (kvVar == dzVar || (objN = t72Var.N(kvVar)) == u12.b) {
            return dzVar;
        }
        t72Var.d0();
        if (!(objN instanceof kv)) {
            return u12.t(objN);
        }
        if (!z) {
            Throwable th2 = ((kv) objN).a;
            if ((th2 instanceof fq2) && ((fq2) th2).coroutine == t72Var) {
                if (kvVar instanceof kv) {
                    throw ((kv) kvVar).a;
                }
                return kvVar;
            }
        }
        throw ((kv) objN).a;
    }

    public static void r(zzet zzetVar) {
        int iH;
        int iH2 = zzetVar.h(2);
        if (iH2 == 0) {
            zzetVar.f(6);
            return;
        }
        int iU = u(zzetVar, 5, 8, 16) + 1;
        if (iH2 == 1) {
            zzetVar.f(iU * 7);
            return;
        }
        if (iH2 == 2) {
            boolean zG = zzetVar.g();
            int i = true != zG ? 5 : 1;
            int i2 = true == zG ? 7 : 5;
            int i3 = true == zG ? 8 : 6;
            int i4 = 0;
            while (i4 < iU) {
                if (zzetVar.g()) {
                    zzetVar.f(7);
                    iH = 0;
                } else {
                    if (zzetVar.h(2) == 3 && zzetVar.h(i2) * i != 0) {
                        zzetVar.e();
                    }
                    iH = zzetVar.h(i3) * i;
                    if (iH != 0 && iH != 180) {
                        zzetVar.e();
                    }
                    zzetVar.e();
                }
                if (iH != 0 && iH != 180 && zzetVar.g()) {
                    i4++;
                }
                i4++;
            }
        }
    }

    public static void t(zzet zzetVar) {
        zzetVar.f(3);
        zzetVar.f(8);
        boolean zG = zzetVar.g();
        boolean zG2 = zzetVar.g();
        if (zG) {
            zzetVar.f(5);
        }
        if (zG2) {
            zzetVar.f(6);
        }
    }

    public static void a(int i, String str) {
        if (d) {
            return;
        }
        if (i == 6) {
            Log.e("Unity", str);
        }
        if (i == 5) {
            Log.w("Unity", str);
        }
    }

    public static Object e(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        d.w("Both parameters are null");
        return null;
    }

    public static final void l(qo qoVar, dy dyVar, boolean z) {
        Object obj = qo.g.get(qoVar);
        Throwable thF = qoVar.f(obj);
        Object j52Var = thF != null ? new j52(thF) : qoVar.g(obj);
        if (!z) {
            dyVar.resumeWith(j52Var);
            return;
        }
        dyVar.getClass();
        oc0 oc0Var = (oc0) dyVar;
        fy fyVar = oc0Var.e;
        Object obj2 = oc0Var.g;
        sy context = fyVar.getContext();
        Object objK = ep0.K(context, obj2);
        xy2 xy2VarL = objK != ep0.b ? ep0.L(fyVar, context, objK) : null;
        try {
            fyVar.resumeWith(j52Var);
        } finally {
            if (xy2VarL == null || xy2VarL.e0()) {
                ep0.z(context, objK);
            }
        }
    }

    public static String p(zzgx zzgxVar) {
        StringBuilder sb = new StringBuilder(zzgxVar.h());
        for (int i = 0; i < zzgxVar.h(); i++) {
            byte bC = zzgxVar.c(i);
            if (bC == 34) {
                sb.append("\\\"");
            } else if (bC == 39) {
                sb.append("\\'");
            } else if (bC != 92) {
                switch (bC) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bC < 32 || bC > 126) {
                            sb.append('\\');
                            sb.append((char) (((bC >>> 6) & 3) + 48));
                            sb.append((char) (((bC >>> 3) & 7) + 48));
                            sb.append((char) ((bC & 7) + 48));
                        } else {
                            sb.append((char) bC);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static boolean q(zzagp zzagpVar) {
        zzey zzeyVar = new zzey(8);
        int i = x73.d(zzagpVar, zzeyVar).a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        zzagpVar.f(0, 4, zzeyVar.a);
        zzeyVar.E(0);
        int iB = zzeyVar.b();
        if (iB == 1463899717) {
            return true;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iB).length() + 23);
        sb.append("Unsupported form type: ");
        sb.append(iB);
        zzeh.e("WavHeaderReader", sb.toString());
        return false;
    }

    public static final void b() {
        Thread thread;
        if (Looper.getMainLooper() == null) {
            return;
        }
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            thread = mainLooper.getThread();
        } else {
            thread = null;
        }
        s71.b(thread, Thread.currentThread());
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
  (r0v0 int) from 0x0007: SWITCH (r0v0 int)
 case -1811142716: goto B:118:0x0130
 case -1811142715: goto B:113:0x0123
 case -1811142714: goto B:108:0x0116
 case -1811142713: goto B:103:0x0109
 case -1811142712: goto B:98:0x00fc
 case -1811142711: goto B:93:0x00ef
 case -1811142710: goto B:88:0x00e2
 case -1811142709: goto B:83:0x00d5
 case -1811142708: goto B:78:0x00c8
 case -1811142707: goto B:73:0x00bb
 default: goto B:5:0x000a A[RegionRef:SW:4] (LINE:10)
  (r0v0 int) from 0x000a: SWITCH (r0v0 int)
 case -1811142685: goto B:68:0x00ae
 case -1811142684: goto B:63:0x00a1
 case -1811142683: goto B:58:0x0094
 default: goto B:6:0x000d A[RegionRef:SW:5] (LINE:13)
  (r0v0 int) from 0x000d: SWITCH (r0v0 int)
 case 80123371: goto B:53:0x0087
 case 80123372: goto B:48:0x007a
 case 80123373: goto B:43:0x006d
 case 80123374: goto B:38:0x0060
 case 80123375: goto B:33:0x0053
 case 80123376: goto B:28:0x0046
 case 80123377: goto B:23:0x0039
 case 80123378: goto B:18:0x002c
 case 80123379: goto B:13:0x001f
 case 80123380: goto B:8:0x0012
 default: goto B:331:? A[RegionRef:SW:6] (LINE:16)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String c(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "kotlin.Double.Companion";
            case "java.lang.Integer":
                return "kotlin.Int";
            case "java.lang.Cloneable":
                return "kotlin.Cloneable";
            case "java.lang.annotation.Annotation":
                return "kotlin.Annotation";
            case "java.lang.Comparable":
                return "kotlin.Comparable";
            case "java.util.Map":
                return "kotlin.collections.Map";
            case "java.util.Set":
                return "kotlin.collections.Set";
            case "double":
                return "kotlin.Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "kotlin.Byte.Companion";
            case "java.lang.CharSequence":
                return "kotlin.CharSequence";
            case "java.util.Collection":
                return "kotlin.collections.Collection";
            case "java.lang.Float":
                return "kotlin.Float";
            case "java.lang.Short":
                return "kotlin.Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "kotlin.Char.Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "kotlin.Long.Companion";
            case "java.util.Map$Entry":
                return "kotlin.collections.Map.Entry";
            case "int":
                return "kotlin.Int";
            case "byte":
                return "kotlin.Byte";
            case "char":
                return "kotlin.Char";
            case "long":
                return "kotlin.Long";
            case "boolean":
                return "kotlin.Boolean";
            case "java.util.List":
                return "kotlin.collections.List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "kotlin.Short.Companion";
            case "float":
                return "kotlin.Float";
            case "short":
                return "kotlin.Short";
            case "java.lang.Character":
                return "kotlin.Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "kotlin.Enum.Companion";
            case "java.lang.Boolean":
                return "kotlin.Boolean";
            case "java.lang.Byte":
                return "kotlin.Byte";
            case "java.lang.Enum":
                return "kotlin.Enum";
            case "java.lang.Long":
                return "kotlin.Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "kotlin.Float.Companion";
            case "java.util.Iterator":
                return "kotlin.collections.Iterator";
            case "java.util.ListIterator":
                return "kotlin.collections.ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "kotlin.String.Companion";
            case "java.lang.Double":
                return "kotlin.Double";
            case "java.lang.Number":
                return "kotlin.Number";
            case "java.lang.Object":
                return "kotlin.Any";
            case "java.lang.String":
                return "kotlin.String";
            case "java.lang.Iterable":
                return "kotlin.collections.Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "kotlin.Boolean.Companion";
            case "java.lang.Throwable":
                return "kotlin.Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "kotlin.Int.Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static boolean d(ti2 ti2Var) {
        Intent intent;
        Long l;
        String str;
        Iterator it = ((ActivityManager) StartupLifecycleProvider.application.getSystemService("activity")).getHistoricalProcessStartReasons(8).iterator();
        while (it.hasNext()) {
            ApplicationStartInfo applicationStartInfoJ = pz1.j(it.next());
            if (applicationStartInfoJ.getPid() == Process.myPid() && applicationStartInfoJ.getStartupState() == 2 && (intent = applicationStartInfoJ.getIntent()) != null && intent.getComponent() != null && intent.getComponent().getClassName().equals(ti2Var.d) && (l = (Long) applicationStartInfoJ.getStartupTimestamps().get(0)) != null) {
                double dLongValue = l.longValue() / 1000000.0d;
                if (dLongValue >= ti2Var.c && dLongValue <= ti2Var.b + 1) {
                    int startType = applicationStartInfoJ.getStartType();
                    if (startType != 1) {
                        if (startType != 2) {
                            if (startType == 3) {
                                str = "hot";
                            }
                        } else {
                            str = "warm";
                        }
                    } else {
                        str = "cold";
                    }
                    Long l2 = (Long) applicationStartInfoJ.getStartupTimestamps().get(4);
                    synchronized (StartupLifecycleProvider.gate) {
                        try {
                            ti2Var.f = str;
                            ti2Var.g = "android_os";
                            if (l2 != null && l2.longValue() >= l.longValue()) {
                                ti2Var.i = (l2.longValue() - l.longValue()) / 1000000.0d;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static final int f(SerialDescriptor serialDescriptor, r91 r91Var, String str) {
        Object obj;
        serialDescriptor.getClass();
        r91Var.getClass();
        str.getClass();
        i(r91Var, serialDescriptor);
        int iC = serialDescriptor.c(str);
        if (iC != -3 || !r91Var.a.j) {
            return iC;
        }
        tb0 tb0Var = r91Var.c;
        v5 v5Var = new v5(22, serialDescriptor, r91Var);
        tb0Var.getClass();
        ConcurrentHashMap concurrentHashMap = tb0Var.a;
        Map map = (Map) concurrentHashMap.get(serialDescriptor);
        xb2 xb2Var = a;
        Object objInvoke = null;
        if (map != null) {
            obj = map.get(xb2Var);
        } else {
            obj = null;
        }
        if (obj != null) {
            objInvoke = obj;
        }
        if (objInvoke == null) {
            objInvoke = v5Var.invoke();
            Object concurrentHashMap2 = concurrentHashMap.get(serialDescriptor);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(serialDescriptor, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(xb2Var, objInvoke);
        }
        Integer num = (Integer) ((Map) objInvoke).get(str);
        if (num == null) {
            return -3;
        }
        return num.intValue();
    }

    public static final int g(SerialDescriptor serialDescriptor, r91 r91Var, String str, String str2) {
        serialDescriptor.getClass();
        r91Var.getClass();
        str.getClass();
        int iF = f(serialDescriptor, r91Var, str);
        if (iF != -3) {
            return iF;
        }
        throw new ba2(serialDescriptor.h() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final boolean h(r91 r91Var, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        r91Var.getClass();
        if (!r91Var.a.b) {
            List annotations = serialDescriptor.getAnnotations();
            if (!(annotations instanceof Collection) || !annotations.isEmpty()) {
                Iterator it = annotations.iterator();
                while (it.hasNext()) {
                    if (((Annotation) it.next()) instanceof ra1) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static final void i(r91 r91Var, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        r91Var.getClass();
        s71.b(serialDescriptor.getKind(), nk2.d);
    }

    public static final void j(zu0 zu0Var, String str, Boolean bool) {
        d dVarA = ia1.a(bool);
        dVarA.getClass();
    }

    public static final void k(zu0 zu0Var, String str, String str2) {
        d dVarC = ia1.c(str2);
        dVarC.getClass();
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
  (r0v0 int) from 0x0007: SWITCH (r0v0 int)
 case -1811142716: goto B:118:0x0130
 case -1811142715: goto B:113:0x0123
 case -1811142714: goto B:108:0x0116
 case -1811142713: goto B:103:0x0109
 case -1811142712: goto B:98:0x00fc
 case -1811142711: goto B:93:0x00ef
 case -1811142710: goto B:88:0x00e2
 case -1811142709: goto B:83:0x00d5
 case -1811142708: goto B:78:0x00c8
 case -1811142707: goto B:73:0x00bb
 default: goto B:5:0x000a A[RegionRef:SW:4] (LINE:10)
  (r0v0 int) from 0x000a: SWITCH (r0v0 int)
 case -1811142685: goto B:68:0x00ae
 case -1811142684: goto B:63:0x00a1
 case -1811142683: goto B:58:0x0094
 default: goto B:6:0x000d A[RegionRef:SW:5] (LINE:13)
  (r0v0 int) from 0x000d: SWITCH (r0v0 int)
 case 80123371: goto B:53:0x0087
 case 80123372: goto B:48:0x007a
 case 80123373: goto B:43:0x006d
 case 80123374: goto B:38:0x0060
 case 80123375: goto B:33:0x0053
 case 80123376: goto B:28:0x0046
 case 80123377: goto B:23:0x0039
 case 80123378: goto B:18:0x002c
 case 80123379: goto B:13:0x001f
 case 80123380: goto B:8:0x0012
 default: goto B:313:? A[RegionRef:SW:6] (LINE:16)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String m(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "Companion";
            case "java.lang.Integer":
                return "Int";
            case "java.lang.Cloneable":
                return "Cloneable";
            case "java.lang.annotation.Annotation":
                return "Annotation";
            case "java.lang.Comparable":
                return "Comparable";
            case "java.util.Map":
                return "Map";
            case "java.util.Set":
                return "Set";
            case "double":
                return "Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "Companion";
            case "java.lang.CharSequence":
                return "CharSequence";
            case "java.util.Collection":
                return "Collection";
            case "java.lang.Float":
                return "Float";
            case "java.lang.Short":
                return "Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "Companion";
            case "java.util.Map$Entry":
                return "Entry";
            case "int":
                return "Int";
            case "byte":
                return "Byte";
            case "char":
                return "Char";
            case "long":
                return "Long";
            case "boolean":
                return "Boolean";
            case "java.util.List":
                return "List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "Companion";
            case "float":
                return "Float";
            case "short":
                return "Short";
            case "java.lang.Character":
                return "Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "Companion";
            case "java.lang.Boolean":
                return "Boolean";
            case "java.lang.Byte":
                return "Byte";
            case "java.lang.Enum":
                return "Enum";
            case "java.lang.Long":
                return "Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "Companion";
            case "java.util.Iterator":
                return "Iterator";
            case "java.util.ListIterator":
                return "ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "Companion";
            case "java.lang.Double":
                return "Double";
            case "java.lang.Number":
                return "Number";
            case "java.lang.Object":
                return "Any";
            case "java.lang.String":
                return "String";
            case "java.lang.Iterable":
                return "Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "Companion";
            case "java.lang.Throwable":
                return "Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static final Bundle o(String str, String str2) {
        str.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_SERVER_CLIENT_ID", str);
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_NONCE", str2);
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_HOSTED_DOMAIN_FILTER", null);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_AUTO_SELECT_ENABLED", true);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GOOGLE_ID_TOKEN_SUBTYPE", "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_SIWG_CREDENTIAL");
        return bundle;
    }

    public static x73 s(int i, zzagp zzagpVar, zzey zzeyVar) throws zzat {
        x73 x73VarD = x73.d(zzagpVar, zzeyVar);
        while (true) {
            int i2 = x73VarD.a;
            if (i2 != i) {
                rl3.q(new StringBuilder(String.valueOf(i2).length() + 28), "Ignoring unknown WAV chunk: ", i2, "WavHeaderReader");
                long j = x73VarD.b;
                long j2 = 8 + j;
                if ((1 & j) != 0) {
                    j2 = 9 + j;
                }
                if (j2 <= 2147483647L) {
                    zzagpVar.zzf((int) j2);
                    x73VarD = x73.d(zzagpVar, zzeyVar);
                } else {
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 40);
                    sb.append("Chunk is too large (~2GB+) to skip; id: ");
                    sb.append(i2);
                    throw zzat.c(sb.toString());
                }
            } else {
                return x73VarD;
            }
        }
    }

    public static int u(zzet zzetVar, int i, int i2, int i3) {
        boolean z;
        if (Math.max(Math.max(i, i2), i3) <= 31) {
            z = true;
        } else {
            z = false;
        }
        zzgvz.a(z);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        Math.addExact(Math.addExact(i4, i5), 1 << i3);
        if (zzetVar.b() >= i) {
            int iH = zzetVar.h(i);
            if (iH == i4) {
                if (zzetVar.b() >= i2) {
                    int iH2 = zzetVar.h(i2);
                    iH += iH2;
                    if (iH2 == i5) {
                        if (zzetVar.b() >= i3) {
                            return zzetVar.h(i3) + iH;
                        }
                    }
                }
            }
            return iH;
        }
        return -1;
    }
}
