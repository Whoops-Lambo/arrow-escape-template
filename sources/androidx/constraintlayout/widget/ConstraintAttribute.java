package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class ConstraintAttribute {
    public boolean a = false;
    public String b;
    public AttributeType c;
    public int d;
    public float e;
    public String f;
    public boolean g;
    public int h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class AttributeType {
        public static final AttributeType a;
        public static final AttributeType b;
        public static final AttributeType c;
        public static final AttributeType d;
        public static final AttributeType e;
        public static final AttributeType f;
        public static final AttributeType g;
        public static final AttributeType h;
        public static final /* synthetic */ AttributeType[] i;

        static {
            AttributeType attributeType = new AttributeType("INT_TYPE", 0);
            a = attributeType;
            AttributeType attributeType2 = new AttributeType("FLOAT_TYPE", 1);
            b = attributeType2;
            AttributeType attributeType3 = new AttributeType("COLOR_TYPE", 2);
            c = attributeType3;
            AttributeType attributeType4 = new AttributeType("COLOR_DRAWABLE_TYPE", 3);
            d = attributeType4;
            AttributeType attributeType5 = new AttributeType("STRING_TYPE", 4);
            e = attributeType5;
            AttributeType attributeType6 = new AttributeType("BOOLEAN_TYPE", 5);
            f = attributeType6;
            AttributeType attributeType7 = new AttributeType("DIMENSION_TYPE", 6);
            g = attributeType7;
            AttributeType attributeType8 = new AttributeType("REFERENCE_TYPE", 7);
            h = attributeType8;
            i = new AttributeType[]{attributeType, attributeType2, attributeType3, attributeType4, attributeType5, attributeType6, attributeType7, attributeType8};
        }

        public static AttributeType valueOf(String str) {
            return (AttributeType) Enum.valueOf(AttributeType.class, str);
        }

        public static AttributeType[] values() {
            return (AttributeType[]) i.clone();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintAttribute$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AttributeType.values().length];
            a = iArr;
            try {
                iArr[7] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[5] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[6] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public final void b(Object obj) {
        switch (this.c.ordinal()) {
            case 0:
            case 7:
                this.d = ((Integer) obj).intValue();
                break;
            case 1:
                this.e = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.h = ((Integer) obj).intValue();
                break;
            case 4:
                this.f = (String) obj;
                break;
            case 5:
                this.g = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.e = ((Float) obj).floatValue();
                break;
        }
    }

    public ConstraintAttribute(ConstraintAttribute constraintAttribute, Object obj) {
        this.b = constraintAttribute.b;
        this.c = constraintAttribute.c;
        b(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.e);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf = null;
        AttributeType attributeType = null;
        boolean z = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z = true;
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                attributeType = AttributeType.f;
            } else if (index == 3) {
                objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                attributeType = AttributeType.c;
            } else if (index == 2) {
                objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                attributeType = AttributeType.d;
            } else {
                AttributeType attributeType2 = AttributeType.g;
                if (index == 7) {
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                } else if (index == 5) {
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                    attributeType = AttributeType.b;
                } else if (index == 6) {
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                    attributeType = AttributeType.a;
                } else if (index == 9) {
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                    attributeType = AttributeType.e;
                } else if (index == 8) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                    attributeType = AttributeType.h;
                }
                attributeType = attributeType2;
            }
        }
        if (string != null && objValueOf != null) {
            ConstraintAttribute constraintAttribute = new ConstraintAttribute();
            constraintAttribute.b = string;
            constraintAttribute.c = attributeType;
            constraintAttribute.a = z;
            constraintAttribute.b(objValueOf);
            map.put(string, constraintAttribute);
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
