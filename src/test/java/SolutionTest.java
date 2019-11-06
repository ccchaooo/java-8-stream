import org.junit.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

/**
 * @author dengchao
 * @date 2019/11/6 0006 14:53
 */
public class SolutionTest {


    /**
     * 一共五页,每页10个单词.第二页和第三页的单词被污染了.
     * 污染方式:单词中间被嵌入了特殊字符和数字
     * 目的:整理被污染的第二页,第三页的单词
     * 要求: 1.清除污染物
     *      2.整理单词,不要出现重复单词,不要出现长度大于10的单词
     *      3.首字母相同的单词相邻,首字母相同的情况下按长度排序
     */
    @Test
    public void find() {
        /*用作参考的原文*/
        String[] origin = {
                /* - 第一页 - */
                "wake",
                "vital",
                "chase",
                "casualty",
                "articulate",
                "sour",
                "bout",
                "intimidate",
                "lurk",
                "ordeal",
                /* - 第二页 - */
                "flicker",
                "flicker",
                "commemorate",
                "falter",
                "sensual",
                "renounce",
                "caricature",
                "palate",
                "protrude",
                "swerve",
                /* - 第三页 - */
                "forfeit",
                "memento",
                "waffle",
                "resonant",
                "protege",
                "cataract",
                "acquiesce",
                "broach",
                "enthrall",
                "talon",
                /* - 第四页 - */
                "goad",
                "matinee",
                "premonition",
                "impinge",
                "porridge",
                "functionary",
                "rasp",
                "obviate",
                "bard",
                "mollify",
                /* - 第五页 - */
                "mote",
                "fecundity",
                "droll",
                "depredation",
                "pliant",
                "hermetic",
                "compunction",
                "torpor",
                "retrench",
                "natty"
        };
        String[] words = {
                /* - 第一页 - */
                "wake",
                "vital",
                "chase",
                "casualty",
                "articulate",
                "sour",
                "bout",
                "intimidate",
                "lurk",
                "ordeal",
                /* - 第二页 - */
                "fli3c4k556er",
                "flic23**&ker",
                "commem$%^@orate",
                "falt)(*er",
                "sensu2637al",
                "reno11u2n2ce",
                "caric440a((ture",
                "p($$alate)",
                "pro89123trude",
                "swer&&*ve",
                /* - 第三页 - */
                "forfeit",
                "memento",
                "waffle",
                "res2on456782ant",
                "pr222o444tege",
                "catara*&%ct",
                "acqu)(*ie1sce",
                "broa#$ch",
                "enthrall",
                "tal**$on",
                /* - 第四页 - */
                "goad",
                "matinee",
                "premonition",
                "impinge",
                "porridge",
                "functionary",
                "rasp",
                "obviate",
                "bard",
                "mollify",
                /* - 第五页 - */
                "mote",
                "fecundity",
                "droll",
                "depredation",
                "pliant",
                "hermetic",
                "compunction",
                "torpor",
                "retrench",
                "natty"
        };
    }
}