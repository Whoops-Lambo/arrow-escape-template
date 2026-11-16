package okio;

import defpackage.ak1;
import defpackage.jc1;
import defpackage.nj;
import defpackage.pv1;
import defpackage.s71;
import defpackage.vq2;
import defpackage.wr0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0011\u001a'\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0080\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a;\u0010\u0013\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110\u0010H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a;\u0010\u0016\u001a\u00020\u0011*\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00110\u0010H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a;\u0010\u0019\u001a\u00020\u0011*\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00110\u0010H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0017\u001a;\u0010\u001a\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00110\u0010H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a;\u0010\u001c\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00110\u0010H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001b\u001a;\u0010\u001d\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00110\u0010H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\"\u0014\u0010 \u001a\u00020\u00188\u0000X\u0080T¢\u0006\u0006\n\u0004\b \u0010!\"\u0014\u0010\"\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b\"\u0010#\"\u0014\u0010$\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b$\u0010#\"\u0014\u0010%\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b%\u0010#\"\u0014\u0010&\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b&\u0010#\"\u0014\u0010'\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b'\u0010#\"\u0014\u0010(\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b(\u0010#\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006)"}, d2 = {"", "", "beginIndex", "endIndex", "", "size", "(Ljava/lang/String;II)J", "utf8Size", "codePoint", "", "isIsoControl", "(I)Z", "", "byte", "isUtf8Continuation", "(B)Z", "Lkotlin/Function1;", "Laz2;", "yield", "processUtf8Bytes", "(Ljava/lang/String;IILwr0;)V", "", "processUtf8CodePoints", "([BIILwr0;)V", "", "processUtf16Chars", "process2Utf8Bytes", "([BIILwr0;)I", "process3Utf8Bytes", "process4Utf8Bytes", "REPLACEMENT_BYTE", "B", "REPLACEMENT_CHARACTER", "C", "REPLACEMENT_CODE_POINT", "I", "HIGH_SURROGATE_HEADER", "LOG_SURROGATE_HEADER", "MASK_2BYTES", "MASK_3BYTES", "MASK_4BYTES", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class Utf8 {
    public static final int HIGH_SURROGATE_HEADER = 55232;
    public static final int LOG_SURROGATE_HEADER = 56320;
    public static final int MASK_2BYTES = 3968;
    public static final int MASK_3BYTES = -123008;
    public static final int MASK_4BYTES = 3678080;
    public static final byte REPLACEMENT_BYTE = 63;
    public static final char REPLACEMENT_CHARACTER = 65533;
    public static final int REPLACEMENT_CODE_POINT = 65533;

    public static final boolean isIsoControl(int i) {
        if (i < 0 || i >= 32) {
            return 127 <= i && i < 160;
        }
        return true;
    }

    public static final boolean isUtf8Continuation(byte b) {
        return (b & 192) == 128;
    }

    public static /* synthetic */ long size$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return size(str, i, i2);
    }

    public static final int process2Utf8Bytes(@NotNull byte[] bArr, int i, int i2, @NotNull wr0 wr0Var) {
        bArr.getClass();
        wr0Var.getClass();
        int i3 = i + 1;
        if (i2 <= i3) {
            wr0Var.invoke(65533);
            return 1;
        }
        byte b = bArr[i];
        byte b2 = bArr[i3];
        if ((b2 & 192) == 128) {
            int i4 = (b2 ^ 3968) ^ (b << 6);
            if (i4 < 128) {
                wr0Var.invoke(65533);
                return 2;
            }
            wr0Var.invoke(Integer.valueOf(i4));
            return 2;
        }
        wr0Var.invoke(65533);
        return 1;
    }

    public static final int process3Utf8Bytes(@NotNull byte[] bArr, int i, int i2, @NotNull wr0 wr0Var) {
        bArr.getClass();
        wr0Var.getClass();
        int i3 = i + 2;
        if (i2 <= i3) {
            wr0Var.invoke(65533);
            int i4 = i + 1;
            if (i2 <= i4 || (bArr[i4] & 192) != 128) {
                return 1;
            }
            return 2;
        }
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        if ((b2 & 192) == 128) {
            byte b3 = bArr[i3];
            if ((b3 & 192) == 128) {
                int i5 = ((b3 ^ (-123008)) ^ (b2 << 6)) ^ (b << 12);
                if (i5 < 2048) {
                    wr0Var.invoke(65533);
                    return 3;
                }
                if (55296 <= i5 && i5 < 57344) {
                    wr0Var.invoke(65533);
                    return 3;
                }
                wr0Var.invoke(Integer.valueOf(i5));
                return 3;
            }
            wr0Var.invoke(65533);
            return 2;
        }
        wr0Var.invoke(65533);
        return 1;
    }

    public static final int process4Utf8Bytes(@NotNull byte[] bArr, int i, int i2, @NotNull wr0 wr0Var) {
        bArr.getClass();
        wr0Var.getClass();
        int i3 = i + 3;
        if (i2 <= i3) {
            wr0Var.invoke(65533);
            int i4 = i + 1;
            if (i2 <= i4 || (bArr[i4] & 192) != 128) {
                return 1;
            }
            int i5 = i + 2;
            if (i2 <= i5 || (bArr[i5] & 192) != 128) {
                return 2;
            }
            return 3;
        }
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        if ((b2 & 192) == 128) {
            byte b3 = bArr[i + 2];
            if ((b3 & 192) == 128) {
                byte b4 = bArr[i3];
                if ((b4 & 192) == 128) {
                    int i6 = (((b4 ^ 3678080) ^ (b3 << 6)) ^ (b2 << 12)) ^ (b << 18);
                    if (i6 > 1114111) {
                        wr0Var.invoke(65533);
                        return 4;
                    }
                    if (55296 <= i6 && i6 < 57344) {
                        wr0Var.invoke(65533);
                        return 4;
                    }
                    if (i6 < 65536) {
                        wr0Var.invoke(65533);
                        return 4;
                    }
                    wr0Var.invoke(Integer.valueOf(i6));
                    return 4;
                }
                wr0Var.invoke(65533);
                return 3;
            }
            wr0Var.invoke(65533);
            return 2;
        }
        wr0Var.invoke(65533);
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    public static final void processUtf16Chars(@NotNull byte[] bArr, int i, int i2, @NotNull wr0 wr0Var) {
        bArr.getClass();
        wr0Var.getClass();
        while (i < i2) {
            byte b = bArr[i];
            if (b >= 0) {
                wr0Var.invoke(Character.valueOf((char) b));
                i++;
                while (i < i2) {
                    byte b2 = bArr[i];
                    if (b2 < 0) {
                        break;
                    }
                    i++;
                    wr0Var.invoke(Character.valueOf((char) b2));
                }
            } else {
                int i3 = 2;
                if ((b >> 5) == -2) {
                    int i4 = i + 1;
                    if (i2 > i4) {
                        byte b3 = bArr[i4];
                        if ((b3 & 192) == 128) {
                            int i5 = (b << 6) ^ (b3 ^ 3968);
                            if (i5 < 128) {
                                wr0Var.invoke((char) 65533);
                            } else {
                                wr0Var.invoke(Character.valueOf((char) i5));
                            }
                        }
                        i += i3;
                    }
                    wr0Var.invoke((char) 65533);
                    i3 = 1;
                    i += i3;
                } else if ((b >> 4) == -2) {
                    int i6 = i + 2;
                    if (i2 <= i6) {
                        wr0Var.invoke((char) 65533);
                        int i7 = i + 1;
                        if (i2 <= i7 || (bArr[i7] & 192) != 128) {
                            i3 = 1;
                        }
                    } else {
                        byte b4 = bArr[i + 1];
                        if ((b4 & 192) == 128) {
                            byte b5 = bArr[i6];
                            if ((b5 & 192) == 128) {
                                int i8 = (b << 12) ^ ((b5 ^ (-123008)) ^ (b4 << 6));
                                if (i8 < 2048 || (55296 <= i8 && i8 < 57344)) {
                                    wr0Var.invoke((char) 65533);
                                } else {
                                    wr0Var.invoke(Character.valueOf((char) i8));
                                }
                                i3 = 3;
                            } else {
                                wr0Var.invoke((char) 65533);
                            }
                        } else {
                            wr0Var.invoke((char) 65533);
                            i3 = 1;
                        }
                    }
                    i += i3;
                } else if ((b >> 3) == -2) {
                    int i9 = i + 3;
                    if (i2 <= i9) {
                        wr0Var.invoke((char) 65533);
                        int i10 = i + 1;
                        if (i2 <= i10 || (bArr[i10] & 192) != 128) {
                            i3 = 1;
                        } else {
                            int i11 = i + 2;
                            if (i2 > i11 && (bArr[i11] & 192) == 128) {
                                i3 = 3;
                            }
                        }
                    } else {
                        byte b6 = bArr[i + 1];
                        if ((b6 & 192) == 128) {
                            byte b7 = bArr[i + 2];
                            if ((b7 & 192) == 128) {
                                byte b8 = bArr[i9];
                                if ((b8 & 192) == 128) {
                                    int i12 = (b << 18) ^ (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12));
                                    if (i12 > 1114111 || ((55296 <= i12 && i12 < 57344) || i12 < 65536 || i12 == 65533)) {
                                        wr0Var.invoke((char) 65533);
                                    } else {
                                        wr0Var.invoke(Character.valueOf((char) ((i12 >>> 10) + 55232)));
                                        wr0Var.invoke(Character.valueOf((char) ((i12 & 1023) + 56320)));
                                    }
                                    i3 = 4;
                                } else {
                                    wr0Var.invoke((char) 65533);
                                    i3 = 3;
                                }
                            } else {
                                wr0Var.invoke((char) 65533);
                            }
                        } else {
                            wr0Var.invoke((char) 65533);
                            i3 = 1;
                        }
                    }
                    i += i3;
                } else {
                    wr0Var.invoke((char) 65533);
                    i++;
                }
            }
        }
    }

    public static final void processUtf8Bytes(@NotNull String str, int i, int i2, @NotNull wr0 wr0Var) {
        int i3;
        char cCharAt;
        str.getClass();
        wr0Var.getClass();
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (s71.h(cCharAt2, 128) < 0) {
                wr0Var.invoke(Byte.valueOf((byte) cCharAt2));
                i++;
                while (i < i2 && s71.h(str.charAt(i), 128) < 0) {
                    wr0Var.invoke(Byte.valueOf((byte) str.charAt(i)));
                    i++;
                }
            } else {
                if (s71.h(cCharAt2, 2048) < 0) {
                    wr0Var.invoke(Byte.valueOf((byte) ((cCharAt2 >> 6) | 192)));
                    wr0Var.invoke(Byte.valueOf((byte) ((cCharAt2 & '?') | 128)));
                } else if (55296 <= cCharAt2 && cCharAt2 < 57344) {
                    if (s71.h(cCharAt2, 56319) <= 0 && i2 > (i3 = i + 1) && 56320 <= (cCharAt = str.charAt(i3)) && cCharAt < 57344) {
                        int iCharAt = (str.charAt(i3) + (cCharAt2 << '\n')) - 56613888;
                        wr0Var.invoke(Byte.valueOf((byte) ((iCharAt >> 18) | 240)));
                        wr0Var.invoke(Byte.valueOf((byte) (((iCharAt >> 12) & 63) | 128)));
                        wr0Var.invoke(Byte.valueOf((byte) (((iCharAt >> 6) & 63) | 128)));
                        wr0Var.invoke(Byte.valueOf((byte) ((iCharAt & 63) | 128)));
                        i += 2;
                    } else {
                        wr0Var.invoke((byte) 63);
                    }
                } else {
                    wr0Var.invoke(Byte.valueOf((byte) ((cCharAt2 >> '\f') | 224)));
                    wr0Var.invoke(Byte.valueOf((byte) (((cCharAt2 >> 6) & 63) | 128)));
                    wr0Var.invoke(Byte.valueOf((byte) ((cCharAt2 & '?') | 128)));
                }
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    public static final void processUtf8CodePoints(@NotNull byte[] bArr, int i, int i2, @NotNull wr0 wr0Var) {
        bArr.getClass();
        wr0Var.getClass();
        while (i < i2) {
            byte b = bArr[i];
            if (b >= 0) {
                wr0Var.invoke(Integer.valueOf(b));
                i++;
                while (i < i2) {
                    byte b2 = bArr[i];
                    if (b2 < 0) {
                        break;
                    }
                    i++;
                    wr0Var.invoke(Integer.valueOf(b2));
                }
            } else {
                int i3 = 2;
                if ((b >> 5) == -2) {
                    int i4 = i + 1;
                    if (i2 > i4) {
                        byte b3 = bArr[i4];
                        if ((b3 & 192) == 128) {
                            int i5 = (b << 6) ^ (b3 ^ 3968);
                            if (i5 < 128) {
                                wr0Var.invoke(65533);
                            } else {
                                wr0Var.invoke(Integer.valueOf(i5));
                            }
                        }
                        i += i3;
                    }
                    wr0Var.invoke(65533);
                    i3 = 1;
                    i += i3;
                } else if ((b >> 4) == -2) {
                    int i6 = i + 2;
                    if (i2 <= i6) {
                        wr0Var.invoke(65533);
                        int i7 = i + 1;
                        if (i2 <= i7 || (bArr[i7] & 192) != 128) {
                            i3 = 1;
                        }
                    } else {
                        byte b4 = bArr[i + 1];
                        if ((b4 & 192) == 128) {
                            byte b5 = bArr[i6];
                            if ((b5 & 192) == 128) {
                                int i8 = (b << 12) ^ ((b5 ^ (-123008)) ^ (b4 << 6));
                                if (i8 < 2048 || (55296 <= i8 && i8 < 57344)) {
                                    wr0Var.invoke(65533);
                                } else {
                                    wr0Var.invoke(Integer.valueOf(i8));
                                }
                                i3 = 3;
                            } else {
                                wr0Var.invoke(65533);
                            }
                        } else {
                            wr0Var.invoke(65533);
                            i3 = 1;
                        }
                    }
                    i += i3;
                } else if ((b >> 3) == -2) {
                    int i9 = i + 3;
                    if (i2 <= i9) {
                        wr0Var.invoke(65533);
                        int i10 = i + 1;
                        if (i2 <= i10 || (bArr[i10] & 192) != 128) {
                            i3 = 1;
                        } else {
                            int i11 = i + 2;
                            if (i2 > i11 && (bArr[i11] & 192) == 128) {
                                i3 = 3;
                            }
                        }
                    } else {
                        byte b6 = bArr[i + 1];
                        if ((b6 & 192) == 128) {
                            byte b7 = bArr[i + 2];
                            if ((b7 & 192) == 128) {
                                byte b8 = bArr[i9];
                                if ((b8 & 192) == 128) {
                                    int i12 = (b << 18) ^ (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12));
                                    if (i12 > 1114111 || ((55296 <= i12 && i12 < 57344) || i12 < 65536)) {
                                        wr0Var.invoke(65533);
                                    } else {
                                        wr0Var.invoke(Integer.valueOf(i12));
                                    }
                                    i3 = 4;
                                } else {
                                    wr0Var.invoke(65533);
                                    i3 = 3;
                                }
                            } else {
                                wr0Var.invoke(65533);
                            }
                        } else {
                            wr0Var.invoke(65533);
                            i3 = 1;
                        }
                    }
                    i += i3;
                } else {
                    wr0Var.invoke(65533);
                    i++;
                }
            }
        }
    }

    public static final long size(@NotNull String str, int i, int i2) {
        long j;
        char cCharAt;
        str.getClass();
        long j2 = 0;
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= str.length()) {
                    while (i < i2) {
                        char cCharAt2 = str.charAt(i);
                        if (cCharAt2 < 128) {
                            j2++;
                        } else {
                            if (cCharAt2 < 2048) {
                                j = 2;
                            } else if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                                int i3 = i + 1;
                                if (i3 < i2) {
                                    cCharAt = str.charAt(i3);
                                } else {
                                    cCharAt = 0;
                                }
                                if (cCharAt2 <= 56319 && cCharAt >= 56320 && cCharAt <= 57343) {
                                    j2 += 4;
                                    i += 2;
                                } else {
                                    j2++;
                                    i = i3;
                                }
                            } else {
                                j = 3;
                            }
                            j2 += j;
                        }
                        i++;
                    }
                    return j2;
                }
                vq2.e(str.length(), jc1.s(i2, "endIndex > string.length: ", " > "));
                return 0L;
            }
            ak1.n(nj.i(i2, i, "endIndex < beginIndex: ", " < "));
            return 0L;
        }
        ak1.n(pv1.k(i, "beginIndex < 0: "));
        return 0L;
    }

    public static final long size(@NotNull String str, int i) {
        str.getClass();
        return size$default(str, i, 0, 2, null);
    }

    public static final long size(@NotNull String str) {
        str.getClass();
        return size$default(str, 0, 0, 3, null);
    }
}
