package vaulsys.protocols.apacs70.encoding;

public interface FPA {
	final static int NULL = 0;
	final static int SPACE = 1;
	final static int SINGLESPACE = 2;
	final static int QUESTION_EN = 3;
	final static int BIGGER = 4;
	final static int LITTLE = 5;
	final static int EQUAL = 6;
	final static int MINUS = 7;
	final static int PLUS = 8;
	final static int MULTIPLY = 9;
	final static int SLASH = 10;
	final static int NOT = 11;
	final static int TILDA = 12;
	final static int AT = 13;
	final static int SHARP = 14;
	final static int PERCENT = 15;
	final static int HAT = 16;
	final static int OR = 17;
	final static int AMPERSAND = 18;
	final static int UNDER_LINE = 19;
	final static int PARENTHESE_LEFT_EN = 20;
	final static int PARENTHESE_RIGHT_EN = 21;
	final static int BERAKET_LEFT = 20;
	final static int BERAKET_RIGHT = 21;
	final static int SINGLE_QOUTA = 22;
	final static int DOUBLE_QOUTA = 23;
	final static int COMMA_EN = 24;
	final static int COLON = 25;
	final static int SEMI_COLON = 26;
	final static int DOT = 27;
	final static int GOLABI_28 = 28;
	final static int GOLABI_29 = 29;
	final static int GOLABI_30 = 30;
	final static int GOLABI_31 = 31;
	final static int PARENTHESE_LEFT_FA = 20;
	final static int PARENTHESE_RIGHT_FA = 21;
	final static int QUESTION_FA = 32;
	final static int GIUME_LEFT = 33;
	final static int GIUME_RIGHT = 34;
	final static int COMMA_FA = 35;
	final static int IP_DOT = 36;
	final static int TICK = 37;
	final static int CROSS = 38;
	final static int PASSWORD = 39;
	final static int GOLABI = 0;
	final static int CHECKBOX_FALSE = 40;
	final static int CHECKBOX_TRUE = 41;
	final static int ENTER = 42;
	final static int RIGHT_ALIGNMENT = 43;
	final static int CENTER_ALIGNMENT = 44;
	final static int LEFT_ALIGNMENT = 45;
	final static int ZERO_EN = 46;
	final static int ONE_EN = 47;
	final static int TWO_EN = 48;
	final static int THREE_EN = 49;
	final static int FOUR_EN = 50;
	final static int FIVE_EN = 51;
	final static int SIX_EN = 52;
	final static int SEVEN_EN = 53;
	final static int EIGHT_EN = 54;
	final static int NINE_EN = 55;
	final static int ZERO_FA = 56;
	final static int ONE_FA = 57;
	final static int TWO_FA = 58;
	final static int THREE_FA = 59;
	final static int FOUR_FA = 60;
	final static int FIVE_FA = 61;
	final static int SIX_FA = 62;
	final static int SEVEN_FA = 63;
	final static int EIGHT_FA = 64;
	final static int NINE_FA = 65;
	final static int ALEF_HAMZE_F = 66;
	final static int ALEF_HAMZE_M = 67;
	final static int ALEF_HAMZE_L = 67;
	final static int ALEF_HAMZE_A = 66;
	final static int ALEF_F = 68;
	final static int ALEF_M = 69;
	final static int ALEF_L = 69;
	final static int ALEF_A = 68;
	final static int ALEF_AA_F = 70;
	final static int ALEF_AA_M = 71;
	final static int ALEF_AA_L = 71;
	final static int ALEF_AA_A = 70;
	final static int BE_F = 72;
	final static int BE_M = 73;
	final static int BE_L = 74;
	final static int BE_A = 75;
	final static int PE_F = 76;
	final static int PE_M = 77;
	final static int PE_L = 78;
	final static int PE_A = 79;
	final static int TE_F = 80;
	final static int TE_M = 81;
	final static int TE_L = 82;
	final static int TE_A = 83;
	final static int SE_F = 84;
	final static int SE_M = 85;
	final static int SE_L = 86;
	final static int SE_A = 87;
	final static int JIM_F = 88;
	final static int JIM_M = 89;
	final static int JIM_L = 90;
	final static int JIM_A = 91;
	final static int CHE_F = 92;
	final static int CHE_M = 93;
	final static int CHE_L = 94;
	final static int CHE_A = 95;
	final static int HE_JIMI_F = 96;
	final static int HE_JIMI_M = 97;
	final static int HE_JIMI_L = 98;
	final static int HE_JIMI_A = 99;
	final static int KHE_F = 100;
	final static int KHE_M = 101;
	final static int KHE_L = 102;
	final static int KHE_A = 103;
	final static int DAAL_F = 104;
	final static int DAAL_M = 105;
	final static int DAAL_L = 105;
	final static int DAAL_A = 104;
	final static int ZAAL_F = 106;
	final static int ZAAL_M = 107;
	final static int ZAAL_L = 107;
	final static int ZAAL_A = 106;
	final static int RE_F = 108;
	final static int RE_M = 109;
	final static int RE_L = 109;
	final static int RE_A = 108;
	final static int ZE_F = 110;
	final static int ZE_M = 111;
	final static int ZE_L = 111;
	final static int ZE_A = 110;
	final static int JHE_F = 112;
	final static int JHE_M = 113;
	final static int JHE_L = 113;
	final static int JHE_A = 112;
	final static int SIN_F = 114;
	final static int SIN_M = 115;
	final static int SIN_L = 116;
	final static int SIN_A = 117;
	final static int SHIN_F = 118;
	final static int SHIN_M = 119;
	final static int SHIN_L = 120;
	final static int SHIN_A = 121;
	final static int SAAD_F = 122;
	final static int SAAD_M = 123;
	final static int SAAD_L = 124;
	final static int SAAD_A = 125;
	final static int ZAAD_F = 126;
	final static int ZAAD_M = 127;
	final static int ZAAD_L = 128;
	final static int ZAAD_A = 129;
	final static int TAA_F = 130;
	final static int TAA_M = 131;
	final static int TAA_L = 132;
	final static int TAA_A = 133;
	final static int ZAA_F = 134;
	final static int ZAA_M = 135;
	final static int ZAA_L = 136;
	final static int ZAA_A = 137;
	final static int EYN_F = 138;
	final static int EYN_M = 139;
	final static int EYN_L = 140;
	final static int EYN_A = 141;
	final static int GHEYN_F = 142;
	final static int GHEYN_M = 143;
	final static int GHEYN_L = 144;
	final static int GHEYN_A = 145;
	final static int FE_F = 146;
	final static int FE_M = 147;
	final static int FE_L = 148;
	final static int FE_A = 149;
	final static int GHAAF_F = 150;
	final static int GHAAF_M = 151;
	final static int GHAAF_L = 152;
	final static int GHAAF_A = 153;
	final static int KAAF_F = 154;
	final static int KAAF_M = 155;
	final static int KAAF_L = 156;
	final static int KAAF_A = 157;
	final static int GAAF_F = 158;
	final static int GAAF_M = 159;
	final static int GAAF_L = 160;
	final static int GAAF_A = 161;
	final static int LAAM_F = 162;
	final static int LAAM_M = 163;
	final static int LAAM_L = 164;
	final static int LAAM_A = 165;
	final static int MIM_F = 166;
	final static int MIM_M = 167;
	final static int MIM_L = 168;
	final static int MIM_A = 168;
	final static int NOON_F = 169;
	final static int NOON_M = 170;
	final static int NOON_L = 171;
	final static int NOON_A = 172;
	final static int VAAV_F = 173;
	final static int VAAV_M = 174;
	final static int VAAV_L = 174;
	final static int VAAV_A = 173;
	final static int HE_2CH_F = 175;
	final static int HE_2CH_M = 176;
	final static int HE_2CH_L = 177;
	final static int HE_2CH_A = 178;
	final static int YE_F = 179;
	final static int YE_M = 180;
	final static int YE_L = 181;
	final static int YE_A = 182;
	final static int HAMZE_F = 183;
	final static int HAMZE_M = 184;
	final static int HAMZE_L = 185;
	final static int HAMZE_A = 186;
	final static int A = 187;
	final static int B = 188;
	final static int C = 189;
	final static int D = 190;
	final static int E = 191;
	final static int F = 192;
	final static int G = 193;
	final static int H = 194;
	final static int I = 195;
	final static int J = 196;
	final static int K = 197;
	final static int L = 198;
	final static int M = 199;
	final static int N = 200;
	final static int O = 201;
	final static int P = 202;
	final static int Q = 203;
	final static int R = 204;
	final static int S = 205;
	final static int T = 206;
	final static int U = 207;
	final static int V = 208;
	final static int W = 209;
	final static int X = 210;
	final static int Y = 211;
	final static int Z = 212;
	final static int A_C = 213;
	final static int B_C = 214;
	final static int C_C = 215;
	final static int D_C = 216;
	final static int E_C = 217;
	final static int F_C = 218;
	final static int G_C = 219;
	final static int H_C = 220;
	final static int I_C = 221;
	final static int J_C = 222;
	final static int K_C = 223;
	final static int L_C = 224;
	final static int M_C = 225;
	final static int N_C = 226;
	final static int O_C = 227;
	final static int P_C = 228;
	final static int Q_C = 229;
	final static int R_C = 230;
	final static int S_C = 231;
	final static int T_C = 232;
	final static int U_C = 233;
	final static int V_C = 234;
	final static int W_C = 235;
	final static int X_C = 236;
	final static int Y_C = 237;
	final static int Z_C = 238;
}