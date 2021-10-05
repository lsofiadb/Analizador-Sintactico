/* The following code was generated by JFlex 1.4.3 on 5/10/21, 1:25 p. m. */

package SoloLexico;
import static SoloLexico.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 5/10/21, 1:25 p. m. from the specification file
 * <tt>../AnalizadorLexicoCompleto/src/SoloLexico/Lexico.flex</tt>
 */
class Lexico {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\54\2\0\1\3\22\0\1\3\1\14\1\55\2\0"+
    "\1\11\1\12\1\0\1\31\1\32\1\7\1\5\1\30\1\6\1\27"+
    "\1\10\12\2\1\40\1\37\1\26\1\4\1\25\2\0\32\1\1\35"+
    "\1\0\1\36\1\0\1\1\1\0\1\22\1\47\1\46\1\44\1\20"+
    "\1\21\1\52\1\42\1\43\1\1\1\50\1\23\1\56\1\51\1\45"+
    "\1\60\1\1\1\16\1\24\1\15\1\17\1\1\1\41\1\57\1\53"+
    "\1\1\1\33\1\13\1\34\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\3\13\7\2\2\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\6\2\1\27\1\30\2\2\1\14\1\12\1\31\1\4"+
    "\1\13\17\2\1\0\1\2\1\32\2\2\1\33\24\2"+
    "\1\34\5\2\1\0\1\2\1\35\4\2\1\36\7\2"+
    "\1\37\5\2\1\40\1\41\2\2\1\42\5\2\1\3"+
    "\3\2\1\43\1\44\1\45\3\2\1\46\1\47\1\50"+
    "\5\2\1\51\1\2\1\52\3\2\1\53\1\54\1\55"+
    "\3\2\1\56\1\57\2\2\1\60\2\2\1\61\1\62"+
    "\1\63\1\64\1\2\1\65\1\2\1\66\1\67\2\2"+
    "\1\70\1\2\1\71\1\72\1\73";

  private static int [] zzUnpackAction() {
    int [] result = new int[179];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\61\0\142\0\223\0\304\0\365\0\u0126\0\u0157"+
    "\0\u0188\0\u01b9\0\u0188\0\u01ea\0\u021b\0\365\0\u024c\0\u027d"+
    "\0\u02ae\0\u02df\0\u0310\0\u0341\0\u0372\0\u03a3\0\u03d4\0\61"+
    "\0\61\0\u0405\0\61\0\61\0\61\0\61\0\61\0\61"+
    "\0\61\0\u0436\0\u0467\0\u0498\0\u04c9\0\u04fa\0\u052b\0\61"+
    "\0\61\0\u055c\0\u058d\0\61\0\61\0\61\0\u05be\0\61"+
    "\0\u05ef\0\u0620\0\u0651\0\u0682\0\u06b3\0\u06e4\0\u0715\0\u0746"+
    "\0\u0777\0\u07a8\0\u07d9\0\u080a\0\u083b\0\u086c\0\u089d\0\u08ce"+
    "\0\u08ff\0\142\0\u0930\0\u0961\0\u0992\0\u09c3\0\u09f4\0\u0a25"+
    "\0\u0a56\0\u0a87\0\u0ab8\0\u0ae9\0\u0b1a\0\u0b4b\0\u0b7c\0\u0bad"+
    "\0\u0bde\0\u0c0f\0\u0c40\0\u0c71\0\u0ca2\0\u0cd3\0\u0d04\0\u0d35"+
    "\0\u0d66\0\142\0\u0d97\0\u0dc8\0\u0df9\0\u0e2a\0\u0e5b\0\u0e8c"+
    "\0\u0ebd\0\142\0\u0eee\0\u0f1f\0\u0f50\0\u0f81\0\142\0\u0fb2"+
    "\0\u0fe3\0\u1014\0\u1045\0\u1076\0\u10a7\0\u10d8\0\142\0\u1109"+
    "\0\u113a\0\u116b\0\u119c\0\u11cd\0\142\0\142\0\u11fe\0\u122f"+
    "\0\142\0\u1260\0\u1291\0\u12c2\0\u12f3\0\u1324\0\61\0\u1355"+
    "\0\u1386\0\u13b7\0\142\0\142\0\142\0\u13e8\0\u1419\0\u144a"+
    "\0\142\0\142\0\142\0\u147b\0\u14ac\0\u14dd\0\u150e\0\u153f"+
    "\0\142\0\u1570\0\142\0\u15a1\0\u15d2\0\u1603\0\142\0\142"+
    "\0\142\0\u1634\0\u1665\0\u1696\0\142\0\142\0\u16c7\0\u16f8"+
    "\0\142\0\u1729\0\u175a\0\142\0\142\0\142\0\142\0\u178b"+
    "\0\142\0\u17bc\0\142\0\142\0\u17ed\0\u181e\0\142\0\u184f"+
    "\0\142\0\142\0\142";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[179];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\3\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40"+
    "\1\41\1\42\1\3\1\43\1\44\1\3\1\45\1\46"+
    "\2\3\1\47\1\3\1\50\1\51\1\52\1\3\1\53"+
    "\62\0\2\3\12\0\10\3\14\0\13\3\2\0\3\3"+
    "\2\0\1\4\61\0\1\5\61\0\1\54\60\0\1\55"+
    "\1\56\57\0\1\55\1\0\1\56\56\0\1\55\60\0"+
    "\1\55\3\0\1\57\62\0\1\60\61\0\1\60\46\0"+
    "\2\3\12\0\1\3\1\61\6\3\14\0\12\3\1\62"+
    "\2\0\3\3\1\0\2\3\12\0\3\3\1\63\4\3"+
    "\14\0\13\3\2\0\3\3\1\0\2\3\12\0\10\3"+
    "\14\0\10\3\1\64\2\3\2\0\3\3\1\0\2\3"+
    "\12\0\6\3\1\65\1\3\14\0\10\3\1\66\2\3"+
    "\2\0\1\3\1\67\1\3\1\0\2\3\12\0\5\3"+
    "\1\70\1\71\1\3\14\0\4\3\1\72\6\3\2\0"+
    "\3\3\1\0\2\3\12\0\10\3\14\0\4\3\1\73"+
    "\6\3\2\0\3\3\1\0\2\3\12\0\1\74\7\3"+
    "\14\0\1\75\1\76\3\3\1\77\5\3\2\0\3\3"+
    "\4\0\1\54\20\0\1\54\37\0\1\54\21\0\1\54"+
    "\40\0\1\100\53\0\2\3\12\0\10\3\14\0\1\3"+
    "\1\101\11\3\2\0\3\3\1\0\2\3\12\0\4\3"+
    "\1\102\3\3\14\0\10\3\1\103\2\3\2\0\3\3"+
    "\1\0\2\3\12\0\3\3\1\104\4\3\14\0\4\3"+
    "\1\105\6\3\2\0\3\3\1\0\2\3\12\0\5\3"+
    "\1\106\2\3\14\0\1\3\1\107\1\110\1\3\1\111"+
    "\6\3\2\0\3\3\1\0\2\3\12\0\1\3\1\112"+
    "\6\3\14\0\12\3\1\113\2\0\3\3\1\0\2\3"+
    "\12\0\10\3\14\0\4\3\1\114\6\3\2\0\3\3"+
    "\1\0\2\3\12\0\5\3\1\115\2\3\14\0\13\3"+
    "\2\0\3\3\1\0\2\3\12\0\1\3\1\116\6\3"+
    "\14\0\13\3\2\0\3\3\54\57\1\0\4\57\1\0"+
    "\2\3\12\0\2\3\1\117\5\3\14\0\13\3\2\0"+
    "\3\3\1\0\2\3\12\0\10\3\14\0\13\3\2\0"+
    "\2\3\1\120\1\0\2\3\12\0\1\121\7\3\14\0"+
    "\11\3\1\122\1\3\2\0\3\3\1\0\2\3\12\0"+
    "\7\3\1\123\14\0\2\3\1\124\10\3\2\0\3\3"+
    "\1\0\2\3\12\0\7\3\1\125\14\0\13\3\2\0"+
    "\3\3\1\0\2\3\12\0\2\3\1\126\5\3\14\0"+
    "\13\3\2\0\3\3\1\0\2\3\12\0\1\127\7\3"+
    "\14\0\13\3\2\0\3\3\1\0\2\3\12\0\6\3"+
    "\1\130\1\3\14\0\13\3\2\0\3\3\1\0\2\3"+
    "\12\0\10\3\14\0\4\3\1\131\6\3\2\0\3\3"+
    "\1\0\2\3\12\0\1\3\1\132\6\3\14\0\13\3"+
    "\2\0\3\3\1\0\2\3\12\0\10\3\14\0\10\3"+
    "\1\133\2\3\2\0\3\3\1\0\2\3\12\0\1\3"+
    "\1\134\6\3\14\0\13\3\2\0\3\3\1\0\2\3"+
    "\12\0\10\3\14\0\2\3\1\135\10\3\2\0\3\3"+
    "\1\0\2\3\12\0\10\3\14\0\4\3\1\136\6\3"+
    "\2\0\3\3\1\0\2\3\12\0\5\3\1\137\2\3"+
    "\14\0\13\3\2\0\3\3\2\0\1\140\57\0\2\3"+
    "\12\0\10\3\14\0\2\3\1\141\10\3\2\0\3\3"+
    "\1\0\2\3\12\0\1\142\7\3\14\0\13\3\2\0"+
    "\3\3\1\0\2\3\12\0\4\3\1\143\3\3\14\0"+
    "\13\3\2\0\3\3\1\0\2\3\12\0\2\3\1\144"+
    "\5\3\14\0\13\3\2\0\3\3\1\0\2\3\12\0"+
    "\7\3\1\145\14\0\13\3\2\0\3\3\1\0\2\3"+
    "\12\0\5\3\1\146\2\3\14\0\13\3\2\0\3\3"+
    "\1\0\2\3\12\0\10\3\14\0\10\3\1\147\2\3"+
    "\2\0\3\3\1\0\2\3\12\0\2\3\1\150\5\3"+
    "\14\0\10\3\1\151\2\3\2\0\3\3\1\0\2\3"+
    "\12\0\3\3\1\152\4\3\14\0\13\3\2\0\3\3"+
    "\1\0\2\3\12\0\1\153\7\3\14\0\13\3\2\0"+
    "\3\3\1\0\2\3\12\0\1\154\7\3\14\0\13\3"+
    "\2\0\3\3\1\0\2\3\12\0\10\3\14\0\2\3"+
    "\1\155\10\3\2\0\3\3\1\0\2\3\12\0\10\3"+
    "\14\0\2\3\1\156\10\3\2\0\3\3\1\0\2\3"+
    "\12\0\3\3\1\157\4\3\14\0\13\3\2\0\3\3"+
    "\1\0\2\3\12\0\3\3\1\160\4\3\14\0\13\3"+
    "\2\0\3\3\1\0\2\3\12\0\2\3\1\161\5\3"+
    "\14\0\13\3\2\0\3\3\1\0\2\3\12\0\10\3"+
    "\14\0\2\3\1\162\10\3\2\0\3\3\1\0\2\3"+
    "\12\0\10\3\14\0\2\3\1\163\10\3\2\0\3\3"+
    "\1\0\2\3\12\0\10\3\14\0\4\3\1\164\6\3"+
    "\2\0\3\3\1\0\2\3\12\0\3\3\1\165\4\3"+
    "\14\0\13\3\2\0\3\3\1\0\2\3\12\0\10\3"+
    "\14\0\13\3\2\0\1\166\2\3\1\0\2\3\12\0"+
    "\3\3\1\167\4\3\14\0\13\3\2\0\3\3\1\0"+
    "\2\3\12\0\7\3\1\117\14\0\13\3\2\0\3\3"+
    "\1\0\2\3\12\0\5\3\1\170\2\3\14\0\13\3"+
    "\2\0\3\3\1\0\2\3\12\0\10\3\14\0\11\3"+
    "\1\171\1\3\2\0\3\3\1\0\2\3\12\0\2\3"+
    "\1\172\5\3\14\0\2\3\1\173\10\3\2\0\3\3"+
    "\1\0\2\3\12\0\1\174\7\3\14\0\13\3\2\0"+
    "\3\3\1\0\2\3\12\0\1\3\1\175\6\3\14\0"+
    "\13\3\2\0\3\3\1\0\2\3\12\0\10\3\14\0"+
    "\10\3\1\176\2\3\2\0\3\3\2\0\1\140\27\0"+
    "\1\177\27\0\2\3\12\0\6\3\1\200\1\3\14\0"+
    "\13\3\2\0\3\3\1\0\2\3\12\0\5\3\1\201"+
    "\2\3\14\0\13\3\2\0\3\3\1\0\2\3\12\0"+
    "\10\3\14\0\6\3\1\202\4\3\2\0\3\3\1\0"+
    "\2\3\12\0\3\3\1\203\4\3\14\0\13\3\2\0"+
    "\3\3\1\0\2\3\12\0\1\3\1\204\6\3\14\0"+
    "\13\3\2\0\3\3\1\0\2\3\12\0\1\205\7\3"+
    "\14\0\13\3\2\0\3\3\1\0\2\3\12\0\1\206"+
    "\6\3\1\207\14\0\13\3\2\0\3\3\1\0\2\3"+
    "\12\0\5\3\1\210\2\3\14\0\13\3\2\0\3\3"+
    "\1\0\2\3\12\0\3\3\1\211\4\3\14\0\13\3"+
    "\2\0\3\3\1\0\2\3\12\0\10\3\14\0\4\3"+
    "\1\212\6\3\2\0\3\3\1\0\2\3\12\0\10\3"+
    "\14\0\10\3\1\213\2\3\2\0\3\3\1\0\2\3"+
    "\12\0\10\3\14\0\10\3\1\214\2\3\2\0\3\3"+
    "\1\0\2\3\12\0\10\3\14\0\3\3\1\215\7\3"+
    "\2\0\3\3\1\0\2\3\12\0\1\3\1\216\6\3"+
    "\14\0\13\3\2\0\3\3\1\0\2\3\12\0\7\3"+
    "\1\217\14\0\13\3\2\0\3\3\1\0\2\3\12\0"+
    "\10\3\14\0\11\3\1\220\1\3\2\0\3\3\1\0"+
    "\2\3\12\0\10\3\14\0\10\3\1\221\2\3\2\0"+
    "\3\3\1\0\2\3\12\0\1\3\1\222\6\3\14\0"+
    "\13\3\2\0\3\3\1\0\2\3\12\0\1\223\7\3"+
    "\14\0\13\3\2\0\3\3\1\0\2\3\12\0\10\3"+
    "\14\0\5\3\1\224\5\3\2\0\3\3\1\0\2\3"+
    "\12\0\10\3\14\0\10\3\1\225\2\3\2\0\3\3"+
    "\1\0\2\3\12\0\10\3\14\0\5\3\1\226\5\3"+
    "\2\0\3\3\1\0\2\3\12\0\1\227\7\3\14\0"+
    "\13\3\2\0\3\3\1\0\2\3\12\0\4\3\1\230"+
    "\3\3\14\0\13\3\2\0\3\3\1\0\2\3\12\0"+
    "\3\3\1\231\4\3\14\0\13\3\2\0\3\3\1\0"+
    "\2\3\12\0\2\3\1\232\5\3\14\0\13\3\2\0"+
    "\3\3\1\0\2\3\12\0\6\3\1\233\1\3\14\0"+
    "\13\3\2\0\3\3\1\0\2\3\12\0\10\3\14\0"+
    "\2\3\1\234\10\3\2\0\3\3\1\0\2\3\12\0"+
    "\1\235\7\3\14\0\13\3\2\0\3\3\1\0\2\3"+
    "\12\0\10\3\14\0\7\3\1\236\3\3\2\0\3\3"+
    "\1\0\2\3\12\0\1\237\7\3\14\0\13\3\2\0"+
    "\3\3\1\0\2\3\12\0\3\3\1\240\4\3\14\0"+
    "\13\3\2\0\3\3\1\0\2\3\12\0\10\3\14\0"+
    "\10\3\1\241\2\3\2\0\3\3\1\0\2\3\12\0"+
    "\1\242\7\3\14\0\13\3\2\0\3\3\1\0\2\3"+
    "\12\0\10\3\14\0\10\3\1\243\2\3\2\0\3\3"+
    "\1\0\2\3\12\0\10\3\14\0\10\3\1\244\2\3"+
    "\2\0\3\3\1\0\2\3\12\0\1\245\7\3\14\0"+
    "\13\3\2\0\3\3\1\0\2\3\12\0\10\3\14\0"+
    "\11\3\1\246\1\3\2\0\3\3\1\0\2\3\12\0"+
    "\10\3\14\0\1\3\1\247\11\3\2\0\3\3\1\0"+
    "\2\3\12\0\6\3\1\250\1\3\14\0\13\3\2\0"+
    "\3\3\1\0\2\3\12\0\3\3\1\251\4\3\14\0"+
    "\13\3\2\0\3\3\1\0\2\3\12\0\10\3\14\0"+
    "\10\3\1\252\2\3\2\0\3\3\1\0\2\3\12\0"+
    "\4\3\1\253\3\3\14\0\13\3\2\0\3\3\1\0"+
    "\2\3\12\0\4\3\1\254\3\3\14\0\13\3\2\0"+
    "\3\3\1\0\2\3\12\0\3\3\1\255\4\3\14\0"+
    "\13\3\2\0\3\3\1\0\2\3\12\0\3\3\1\256"+
    "\4\3\14\0\13\3\2\0\3\3\1\0\2\3\12\0"+
    "\1\257\7\3\14\0\13\3\2\0\3\3\1\0\2\3"+
    "\12\0\2\3\1\260\5\3\14\0\13\3\2\0\3\3"+
    "\1\0\2\3\12\0\1\3\1\261\6\3\14\0\13\3"+
    "\2\0\3\3\1\0\2\3\12\0\10\3\14\0\3\3"+
    "\1\262\7\3\2\0\3\3\1\0\2\3\12\0\3\3"+
    "\1\263\4\3\14\0\13\3\2\0\3\3";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6272];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\25\1\2\11\1\1\7\11\6\1\2\11"+
    "\2\1\3\11\1\1\1\11\17\1\1\0\37\1\1\0"+
    "\36\1\1\11\64\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[179];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public String lexemas;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexico(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexico(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 130) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 14: 
          { lexemas=yytext(); return Coma;
          }
        case 60: break;
        case 18: 
          { lexemas=yytext(); return Llave_c;
          }
        case 61: break;
        case 41: 
          { lexemas=yytext(); return Union;
          }
        case 62: break;
        case 28: 
          { lexemas=yytext(); return For;
          }
        case 63: break;
        case 24: 
          { lexemas=yytext(); return Comillas;
          }
        case 64: break;
        case 47: 
          { lexemas=yytext(); return Break;
          }
        case 65: break;
        case 46: 
          { lexemas=yytext(); return Const;
          }
        case 66: break;
        case 38: 
          { lexemas=yytext(); return T_dato;
          }
        case 67: break;
        case 6: 
          { lexemas=yytext(); return Suma;
          }
        case 68: break;
        case 27: 
          { lexemas=yytext(); return Do;
          }
        case 69: break;
        case 52: 
          { lexemas=yytext(); return Switch;
          }
        case 70: break;
        case 23: 
          { return Linea;
          }
        case 71: break;
        case 33: 
          { lexemas=yytext(); return Enum;
          }
        case 72: break;
        case 56: 
          { lexemas=yytext(); return Default;
          }
        case 73: break;
        case 32: 
          { lexemas=yytext(); return Else;
          }
        case 74: break;
        case 58: 
          { lexemas=yytext(); return Unsigned;
          }
        case 75: break;
        case 21: 
          { lexemas=yytext(); return P_Coma;
          }
        case 76: break;
        case 35: 
          { lexemas=yytext(); return Case;
          }
        case 77: break;
        case 15: 
          { lexemas=yytext(); return Parent_a;
          }
        case 78: break;
        case 22: 
          { lexemas=yytext(); return DosPuntos;
          }
        case 79: break;
        case 53: 
          { lexemas=yytext(); return Doble;
          }
        case 80: break;
        case 44: 
          { lexemas=yytext(); return Scanf;
          }
        case 81: break;
        case 34: 
          { lexemas=yytext(); return Long;
          }
        case 82: break;
        case 26: 
          { lexemas=yytext(); return If;
          }
        case 83: break;
        case 39: 
          { lexemas=yytext(); return Goto;
          }
        case 84: break;
        case 48: 
          { lexemas=yytext(); return Return;
          }
        case 85: break;
        case 11: 
          { lexemas=yytext(); return Op_logico;
          }
        case 86: break;
        case 19: 
          { lexemas=yytext(); return Corchete_a;
          }
        case 87: break;
        case 59: 
          { lexemas=yytext(); return Continue;
          }
        case 88: break;
        case 16: 
          { lexemas=yytext(); return Parent_c;
          }
        case 89: break;
        case 50: 
          { lexemas=yytext(); return Struct;
          }
        case 90: break;
        case 17: 
          { lexemas=yytext(); return Llave_a;
          }
        case 91: break;
        case 12: 
          { lexemas = yytext(); return Op_relacional;
          }
        case 92: break;
        case 2: 
          { lexemas=yytext(); return Identificador;
          }
        case 93: break;
        case 13: 
          { lexemas=yytext(); return Punto;
          }
        case 94: break;
        case 10: 
          { lexemas = yytext(); return Op_atribucion;
          }
        case 95: break;
        case 7: 
          { lexemas=yytext(); return Resta;
          }
        case 96: break;
        case 29: 
          { lexemas=yytext(); return Int;
          }
        case 97: break;
        case 25: 
          { lexemas = yytext(); return Op_incremento;
          }
        case 98: break;
        case 8: 
          { lexemas=yytext(); return Multiplicacion;
          }
        case 99: break;
        case 40: 
          { lexemas=yytext(); return Main;
          }
        case 100: break;
        case 49: 
          { lexemas=yytext(); return Extern;
          }
        case 101: break;
        case 43: 
          { lexemas=yytext(); return Short;
          }
        case 102: break;
        case 30: 
          { lexemas=yytext(); return Cin;
          }
        case 103: break;
        case 54: 
          { lexemas=yytext(); return Printf;
          }
        case 104: break;
        case 1: 
          { return ERROR;
          }
        case 105: break;
        case 3: 
          { lexemas=yytext(); return Numero;
          }
        case 106: break;
        case 57: 
          { lexemas=yytext(); return Register;
          }
        case 107: break;
        case 37: 
          { lexemas=yytext(); return Cout;
          }
        case 108: break;
        case 9: 
          { lexemas=yytext(); return Division;
          }
        case 109: break;
        case 4: 
          { /*Ignore*/
          }
        case 110: break;
        case 20: 
          { lexemas=yytext(); return Corchete_c;
          }
        case 111: break;
        case 5: 
          { lexemas=yytext(); return Igual;
          }
        case 112: break;
        case 42: 
          { lexemas=yytext(); return Float;
          }
        case 113: break;
        case 55: 
          { lexemas=yytext(); return Typedef;
          }
        case 114: break;
        case 51: 
          { lexemas=yytext(); return Cadena;
          }
        case 115: break;
        case 45: 
          { lexemas=yytext(); return While;
          }
        case 116: break;
        case 36: 
          { lexemas=yytext(); return Char;
          }
        case 117: break;
        case 31: 
          { lexemas=yytext(); return Op_booleano;
          }
        case 118: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
