/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LW77;

import HuffMann.HuffMann;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Thomas De Praetere
 */
public class LW77Test {

    public LW77Test() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void huffmannTest() {
        System.out.println("huffmannTest");
        String bef = "gedane zaken nemen geen keer.";
        HuffMann h = new HuffMann();
        String ret = h.compact(bef);

        System.out.println(ret);
    }

    /**
     * Test of compress method, of class LW77.
     */
    @Test
    public void testCompress() {
        HuffMann h = new HuffMann();
        System.out.println("compress");
        String bef = "banaan baan";
        LW77 lw = new LW77(64);
        String st = lw.compress(bef, true);
        System.out.println(bef);
        System.out.println(st);
        System.out.println("Length before: " + bef.length());
        System.out.println("Length before huff:" + h.compact(bef).length());
        System.out.println("Length after: " + st.length());
        System.out.println("Length after huff:" + h.compact(st).length());

        bef = "David cursed as he fumbled his key on the door lock and dropped them on the step in front of him. He bent down and picked them up, focussing intently on them as he inserted them into the lock, then realised it was already unlocked. He pushed down on the handle and stepped into his house.\n"
                + "\n"
                + "The inner hall light was on, but that didn't stop him stumbling as he walked forward. Yes, he was drunk, and although the room wasn't quite spinning he knew he'd had more than he should. He dropped his suit jacket on the staircase, pushed open the door to the lounge and smiled, concentrating on not slurring his speech.\n"
                + "\n"
                + "\"Hi there. Sorry I'm a bit later than planned.\"\n"
                + "\n"
                + "The girl on the sofa beamed a smile at him at she sat up straight, lowering the volume on the television. \"Oh hey there Mr Evans. It's cool, don't worry about it.\"\n"
                + "\n"
                + "He realised he was swaying as he stood there, so he took a step forward and sat heavily on the sofa opposite her. \"I only just made the last train,\" he laughed.\n"
                + "\n"
                + "She giggled. \"You had a good night out then?\"\n"
                + "\n"
                + "He smiled, nodding. \"Yeh...it was pretty...ummm interesting. I take it little George was fine? He went to bed with no problems?\"\n"
                + "\n"
                + "She nodded. \"Oh yes, he was a little darling. I read him a couple of stories and then he fell asleep like in seconds,\" she laughed. \"I checked on him about 10 minutes ago and he's sleeping soundly.\"\n"
                + "\n"
                + "David smiled. \"That's great.\" He didn't think there would have been a problem; little George was a great sleeper for a two year old. \"Did Lucinda pay you before she left?\"\n"
                + "\n"
                + "The girl nodded. \"Yeh,\" she giggled. \"She reckoned you might have spent all your cash before you got home so thought it best to pay me before she left!\"\n"
                + "\n"
                + "David laughed. His wife was out with her sister for two nights at a spa, and had arranged for Lauren to come and sit for George while David was out.\n"
                + "\n"
                + "\"So, what was the occasion?\" she asked.\n"
                + "\n"
                + "\"Oh, one of the young guys in my team is leaving for a new job so we had a night on the town to celebrate.\"\n"
                + "\n"
                + "\"Cool,\" she replied, tucking her legs under her as she got comfortable again. \"Did you send him off in style then?\"\n"
                + "\n"
                + "David chuckled. They'd certainly done that. In fact, his colleagues had gone on to a casino after he'd left them so they were probably still sending him off in style, but he'd had to get the last train to the suburbs so couldn't go on with them. Probably just as well; it would no doubt have turned into an even more expensive night that would have taken some explaning to Lucinda when she got home on Sunday.\n"
                + "\n"
                + "\"Yes...I think we gave him a pretty good send off.\" She lifted the remote control and looked at the television as she switched it off. David found himself sneaking a closer look at her.\n"
                + "\n"
                + "She lived a couple of streets away, and was the daughter of one of Lucinda's friends. He'd only lived in the area for three years, so didn't really know much about her. She'd sat for them a couple of times before, though not recently. She seemed older than the last time, and her hair was now dyed blonde. At least, he was sure she hadn't been blonde before. Then he noticed the dark roots in her parting and the dark eyebrows as she looked back at him. He blinked and looked away, hoping she hadn't noticed he'd been gawping at her. \"So where did you go?\" she asked, still smiling.\n"
                + "\n"
                + "David cleared his throat. \"Oh, just for a meal, then a couple of pubs, then a club. The boys went on to a casino but I had to get that last train.\"\n"
                + "\n"
                + "Lauren frowned. \"Oh, that's a shame. Couldn't you have stayed out and got, like, a taxi home or something? I wouldn't have minded.\"\n"
                + "\n"
                + "David smiled. \"That's good of you.\" Conversing directly with her gave him a chance to look at her face as he spoke. She had large, dark eyes, a thin sharp nose and thin lips and he noticed she was wearing matte pink lipstick. Mascara accentuated the natural darkness of her features, contrasting the bright blonde hair. \"To be honest, it had already been a pretty expensive night so a casino and a taxi would've broken the bank...and probably really pissed of Lucinda,\" he chuckled.\n"
                + "\n"
                + "Lauren laughed, and he noticed the metal braces on her teeth. He suddenly realised he didn't know how old she was. He'd seen her a couple of times in school uniform, but the make up made it impossible to place her age.\n"
                + "\n"
                + "\"Which club did you go to?\" she asked with genuine interest.\n"
                + "\n"
                + "\"Huh, oh...ummm...\" He hesitated, with good reason. The 'club' he had been to was not one he wanted to admit being at to his sitter, or indeed his wife for that matter. \"It was...oh, what was it called again...\" he let his voice trail off, hoping he seemed forgetful.\n"
                + "\n"
                + "\"There's some great clubs in town,\" she said. \"I love Tropicana, the music is awesome.\"\n"
                + "\n"
                + "David grinned. He knew of Tropicana, a proper 80s club. \"Seriously?\" he chuckled. \"You like Tropicana. That's an 80s club isn't it, more my age group than yours!\" He was 41, so the 1980s were very much his era for music.\n"
                + "\n"
                + "Lauren giggled. \"Well, yeah, but that old music is still cool.\"\n"
                + "\n"
                + "David smiled, then rolled his eyes. \"Less of the old there Lauren,\" he laughed. \"You, go into town a lot then?\" he added.\n"
                + "\n"
                + "She nodded. \"Yeh, fair bit. Well, when we've got money I guess. It's kinda expensive in town.\"\n"
                + "\n"
                + "He nodded. \"Not wrong there. So, who do you go with?\"\n"
                + "\n"
                + "Lauren shrugged. \"Just my mates.\"\n"
                + "\n"
                + "\"No boyfriend then?\" he said. He wasn't sure why he wanted to know that, and instantly felt awkward for prying.\n"
                + "\n"
                + "She grinned back at him, her braces sparkling in the dim light. \"Not at the moment. I'm going to uni in a couple of months so no point getting into a relationship I reckon.\"\n"
                + "\n"
                + "David nodded. So, she must be in her final high-school year then. \"Makes sense, plenty of boys when you get to uni. I mean...not that you are...well...you know...long distance relationships are diff...\" he realised he was rambling and cursed his drunken brain.\n"
                + "\n"
                + "Lauren giggled again, clearly amused. \"Ah that's good Mr Evans...you're not calling me a little...ummm...slut then.\" She grinned at him.\n"
                + "\n"
                + "He felt himself blush. \"No, no that's not what I meant,\" he replied defensively. \"It's just...at your age...you know...don't really need...ummm...to be...you know tied down...\" He shifted uncomfortably in his seat, wishing he'd kept his mouth shut.\n"
                + "\n"
                + "To his relief, Lauren seemed unfazed and just giggled again. \"I know...just messin' Mr Evans.\"\n"
                + "\n"
                + "He forced a smile, his eyes lowering to her bare knee showing though the wide hole in her jeans. She had pale skin, unlike the faked tanned girls that had been all over the town earlier that night. He noticed her toe nails were painted to match her lips, visible through her black sandals. He blinked, then raised his gaze back to her face, but knew his eyes had lingered on her black, halter neck top and her thin, pale bare arms. He cursed himself. That was the problem with spending two hours in a lap dancing bar; for the next few hours, you felt you could happily look women up and down with no regard for normal manners.\n"
                + "\n"
                + "She took the ends of her long blonde hair in her fingers as she smiled. \"Think you're gonna have a hangover in the morning then?\" she giggled.\n"
                + "\n"
                + "David chuckled. \"Yes! God I hope George sleeps in!\"\n"
                + "\n"
                + "Lauren stood up. \"You want...a glass of water or something?\"\n"
                + "\n"
                + "He nodded. \"Actually...yeh, that would be a good idea.\"\n"
                + "\n"
                + "She smiled. \"I'll get you one,\" then she walked to the door. It struck him how small she was; barely 5 foot tall he reckoned. Her jeans and top were slightly baggy on her, so he couldn't really make out her figure as she left the room. He sat back and exhaled, shaking his head. He couldn't believe he was actually checking her out! He'd had four lap dances, all from big titted, toned and tanned girls. He felt his cock stiffen, then smiled as he remembered his wife was away and as soon as Lauren was gone, he could satisfy himself at his own pleasure. It crossed his mind as to whether he'd be thinking about those strippers, or Lauren. He shuddered...thinking of Lauren was a bit naughty.\n"
                + "\n"
                + "He startled as little as Lauren came back into the room, and he sat forward as she offered him a pint glass full of water. He smiled as he reached out for it, and he noticed her eyes widen a little as he took the glass from her. He half expected her to say she was ready to leave, but to his surprise she want back over to the couch opposite and sat down, again curling her legs under her like before. He took a long gulp of the water.\n"
                + "\n"
                + "\"So,\" she said, looking straight at him with a faint grin on her lips. \"You were at the Paradise Club then?\"\n"
                + "\n"
                + "He gasped, almost spitting the water back into the glass. He felt his heartbeat skip at the mention of the lap dancer bar. \"Ummm...huh?\" was all he could muster in reply.\n"
                + "\n"
                + "Her grin widened. \"The Paradise Club. The strip bar off Lancaster Square. You've got the stamp on your hand.\"\n"
                + "\n"
                + "He looked at the ink stamp on the top of his hand. They used those stamps to allow smokers in and out of the club. He gulped. His foggy brain couldn't construct a lie quickly enough.\n"
                + "\n"
                + "\"Ummm...well...\" he sighed. \"Yeh, we were...ummm...dragged in there by a couple of the younger guys.\" He rolled his eyes, over-dramatically.\n"
                + "\n"
                + "Lauren giggled. \"Dragged huh? Kicking and screaming I bet.\" She grinned at him. \"Don't worry, I won't tell Lucinda.\"\n"
                + "\n"
                + "David allowed himself a smile. \"Thanks...I'd appreciate that. She'd kill me if she knew I'd been in there.\"\n"
                + "\n"
                + "Lauren frowned. \"Really? Why?\"\n"
                + "\n"
                + "David sighed again. \"I don't think my wife would appreciate me paying girls to strip and grind themselves on my lap. Don't think many wives would to be honest.\"\n"
                + "\n"
                + "Lauren shrugged. \"I guess...just harmless fun though isn't it?\"\n"
                + "\n"
                + "David took another sip of water. She had a point, but it seemed strange coming from the mouth of a high-schoolgirl. \"Yeh, of course it is. Not many women see it that way though.\"\n"
                + "\n"
                + "She smiled again, then rolled her eyes. \"Don't see why to be honest. The girls earn good money, and it's just blokes being...well...blokes innit?\" He couldn't determine whether she was speaking with common sense or naivety.\n"
                + "\n"
                + "He grinned at her. \"You seem to know a lot about it,\" he laughed.\n"
                + "\n"
                + "She looked back at him, and he noticed her biting her lower lip. \"Well...\" She seemed to be thinking, her eyes narrowing a little. \"One of my mates actually works there.\"\n"
                + "\n"
                + "David felt his eyes widening. \"R...really?\" he asked, surprised.\n"
                + "\n"
                + "She nodded. \"Yeh, Michelle...well, Tiffany is her stripper name. She's been there about a month now, saving up money for uni.\"\n"
                + "\n"
                + "David closed his eyes, and couldn't help but groan out loudly. He opened them as he heard Lauren burst out laughing.\n"
                + "\n"
                + "\"Oh...My...God! You had a lapdance from her didn't you?\"\n"
                + "\n"
                + "David took a deep breath, and slowly nodded. \"Yes, I'm ashamed to admit it. Fuck.\" He rubbed his forehead with his palm. \"She's...she's your friend? From, from school?\"\n"
                + "\n"
                + "Lauren nodded. \"Yeh, well, she was the year above me. She took a year out, did some travelling and is now getting some money together for uni.\" \n"
                + "\n"
                + "David nodded again. Tiffany; well Michelle, had told him she'd been travelling. \"And,\" he closed his eyes again, fearing the response. \"She lives...umm...in the village?\"\n"
                + "\n"
                + "\"Yeh, in the new houses on the way in. Don't worry though, she'd dead discrete; she won't tell anyone.\"\n"
                + "\n"
                + "David breathed a sigh of relief, though he had a sinking feeling that it would come back to embarrass him at some point. In that moment, he resolved not attend the village fair that year.\n"
                + "\n"
                + "\"Did you...ummm...enjoy your dance from her then?\"\n"
                + "\n"
                + "David blinked, surprised at the question. \"What? Oh, well...yeh, of course\" he replied, figuring it wasn't worth lying.\n"
                + "\n"
                + "Lauren beamed a smile at him. \"Yeh, she's kinda fit aint she? Massive tits too.\"\n"
                + "\n"
                + "David coughed, shocked at how easily those words came out of Lauren's mouth. \"Well...yes, yes she's pretty...ummm...fit.\" He felt it better to reiterate Lauren's words than blurt out his own assessment of her friend. A fleeting memory of a naked Michelle grinding on his lap made him shift uncomfortably. He drained the glass of water, but his mouth still felt dry.\n"
                + "\n"
                + "Lauren twiddled her hair in her fingers again. \"You...ummm...wanna know a secret?\"\n"
                + "\n"
                + "David cleared his throat. The alcohol was still muddling his brain, and despite knowing he should reply with a 'no,' he found himself nodding.\n"
                + "\n"
                + "Lauren giggled, and he noticed her cheeks were a little pink. \"Well...\" she said, drawing out the word. She bit her bottom lip again, then quietly said \"I'm thinking of going for a job there.\"\n"
                + "\n"
                + "David nearly dropped his glass. \"Y...you what?\" he replied.\n"
                + "\n"
                + "She smiled. \"It's really good money...like, really good. Michelle reckons I could make a couple of grand before uni, then top it up in my holidays.\"\n"
                + "\n"
                + "David exhaled as he leaned back. He couldn't believe what she was saying. \"Are...are you serious?\" he asked.\n"
                + "\n"
                + "She nodded. \"Yeh of course. Why not? I think it would be fun.\"\n"
                + "\n"
                + "He exhaled again. His fatherly instinct wanted to give her advice, and lots of it right now. But the alcohol coursing through his veins and the bloke instinct made him realise they would be hollow words. \"But...how...how old are you? Don't you have to be...like 21 to work there or something?\"\n"
                + "\n"
                + "She giggled. \"No! It's 18. I think it's like 21 or something in America, coz 'Chelle tried to get a job dancing when she was over there, but in the UK it's 18.\"\n"
                + "\n"
                + "\"Are you 18 then?\" he asked, still not quite believing the girl in front of him, so small and petite, with braces on her teeth, was indeed that old.\n"
                + "\n"
                + "She frowned at him. \"Yeh, I was 18 a month ago.\"\n"
                + "\n"
                + "He nodded. \"Oh, ok...I just thought...\" his voice trailed off.\n"
                + "\n"
                + "She giggled again. \"It's the braces isn't it? 'Chelle reckons the braces will be a big attraction for some guys, especially on schoolie uniform nights.\"\n"
                + "\n"
                + "David again found himself exhaling. The thought of her in school uniform stripping was...he shook his head, not a thought he should be entertaining right now. Again, he shifted, feeling extremely uncomfortable.\n"
                + "\n"
                + "\"What do you reckon?\" she asked.\n"
                + "\n"
                + "He gulped, but his mouth was bone dry. \"I...ummm...well...I guess...yes...\" he croaked.\n"
                + "\n"
                + "She beamed a smile at him. \"Secret though yeh, promise you won't tell anyone?\"\n"
                + "\n"
                + "He nodded. \"Yes of course...and you don't tell anyone I had a dance from your friend.\" God it felt awkward agreeing to a deal like that.\n"
                + "\n"
                + "Lauren smiled. \"Cool. I've got an interview there next week.\"\n"
                + "\n"
                + "David shook his head, incredulous at her revelation. \"Wow. Well...ummm...good luck, I guess?\"\n"
                + "\n"
                + "She shrugged her shoulders. \"Thanks.\"\n"
                + "\n"
                + "\"What...exactly, does an interview for a job as a lap dancer entail?\" David found himself asking.\n"
                + "\n"
                + "Lauren swept her hair back. \"Think it's a bit of a chat, then I have to do an actual dance routine.\"\n"
                + "\n"
                + "\"Really?\" he replied, his interest genuinely piqued. Very different to the interviews he regularly conducted in his job. \"And...well...you...you've already...ummm...got a routine?\" He suddenly pictured her writhing around her bedroom, stripping off her clothes.\n"
                + "\n"
                + "She frowned. \"Well...yeh kinda. I mean, 'Chelle has been teaching me her moves and stuff.\"\n"
                + "\n"
                + "David nodded. \"That's good then...I mean, having a friend who can show you the...ummm ropes.\" He knew exactly what he'd be thinking about later when he was satisfying himself, that was for sure.\n"
                + "\n"
                + "She nodded again, a concentrated expression on her face. \"Yeh, she's been great. But...well, I only found out about it last week so not had much chance to practice.\"\n"
                + "\n"
                + "David chuckled. \"Yeh, I can imagine it would be a bit weird, practicing on your own. Bet there are plenty boys in your year who would happily have been dummies for you to practice with though.\"\n"
                + "\n"
                + "Lauren laughed. \"No way! Fuck, it'll be bad enough if any of them come into the club. Actually, it's 21 minimum to get in there anyways so hopefully that won't happen.\"\n"
                + "\n"
                + "He nodded. \"Yeh, that would be kinda embarrassing for you. Bit like for me finding out I've been lap danced by a girl in the village!\"\n"
                + "\n"
                + "She giggled again. \"Awww it's not that bad. Bet you won't forget her in a hurry though, huh Mr Evans?\"\n"
                + "\n"
                + "David felt himself blush. She was right; he'd remember Michelle. He felt his cock twinge, and again he shifted in the seat. He tried subtly to adjust the material around his crotch, but in his drunken state, it wasn't as smooth a move as he'd intended. He heard Lauren giggle, and he felt his cheeks flush.\n"
                + "\n"
                + "\"Just think,\" she continued. \"If you'd been there like two weeks later, it could've been me dancing for you!\"\n"
                + "\n"
                + "David coughed. He averted his gaze from her, his head swimming, not able to think of a reply.\n"
                + "\n"
                + "\"Actually, that's a good question. Saying you didn't already know me, would you have paid for a dance from me?\" As he looked up, aware his expression was one of shock, she was staring at him intently, clearing wanting an honest reply.\n"
                + "\n"
                + "\"Well...I...ummm...I mean...of...of course...y...yes, I probably would,\" he stuttered, cursing his inability to think of a positive lie.\n"
                + "\n"
                + "She nodded. \"And...if you did know me. Would you still?\"\n"
                + "\n"
                + "He looked at her and inhaled. \"Lauren...really, I...I don't know...\" He sat forward.\n"
                + "\n"
                + "She frowned, then grinned. \"In a little school uniform?\" her voice trailed off, her suggestive tone hanging in the air.\n"
                + "\n"
                + "David covered his mouth with his hand. His throat was bone dry. \"If I say yes to that, that would make me sound like a dirty old man.\"\n"
                + "\n"
                + "She laughed. \"Would make you sound like a typical bloke I reckon,\" she replied.\n"
                + "\n"
                + "David sighed, then slowly nodded. \"I guess I'd be a typical bloke then.\" He flopped back in the seat, trying to think of a polite way to say it was time for her to go home. For one thing, he now really wanted the peace to masturbate to the flood of naughty thoughts bouncing around in his drunken brain.\n"
                + "\n"
                + "She beamed a smile. \"Awesome. Maybe I should ask you to be a dummy for me to practice on.\"\n"
                + "\n"
                + "David blinked. Had she just said that? Or was that one of the thoughts in his mind. \"Huh?\"\n"
                + "\n"
                + "She swept her hair back. \"Was just saying, maybe...ummm...I could...you know...try out my routine on you.\"\n"
                + "\n"
                + "He sat up straight. \"Are...are you being serious?\" He hoped to god she was just toying with him.\n"
                + "\n"
                + "Lauren looked at him thoughtfully, then nodded. \"Ummm...yeh. I mean...you've obviously got experience being...you know...danced for. And...well...would be good to know how I compare to 'Chelle.\" Her tone was so matter-of-fact David was stunned.\n"
                + "\n"
                + "\"I...bloody hell Lauren...\" He wiped his mouth with the back of his hand, despite it being bone dry. \"I don't really think that would be...ummm...appropriate.\" He suddenly hoped that George would appear at the door, giving him an excuse to end this conversation. But then he remembered the gate at the top of the stairs. Perhaps he should just do the correct adult thing, and end the conversation anyway, but Lauren was quick to speak again.\n"
                + "\n"
                + "\"No more inappropriate than you paying 'Chelle to strip for you,\" she quipped. David opened his mouth to reply, but he didn't have a retort to that. \"So...what do you reckon then?\"\n"
                + "\n"
                + "A million thoughts were crashing around his head. It was wrong, wrong in every way to agree to her crazy suggestion. But he was drunk enough for those thoughts to be easily overcome by the offer of a free lap dance from his sitter. His sitter. He thought briefly of George; not that he would understand. And then his wife. She'd be furious. Perhaps marginally more furious than if she knew he'd been at the Paradise Club and had paid for a local girl, even if he didn't know that at the time, to lap dance for him.\n"
                + "\n"
                + "\"I...I really...d...don't know...\" he stammered.\n"
                + "\n"
                + "Lauren untucked her legs and sat forward. \"Oh go on...it'd really help me,\" she said sweetly.\n"
                + "\n"
                + "David swallowed hard. He looked at her; that small skinny frame, pale skin, bleach blonde hair. She is 18, he told himself. Fuck, she's going to be working as a lap dancer soon. What difference would it make if she practiced on him? Hell, it would make his wank later even better. The alcohol was winning. He closed his eyes, and despite himself, nodded.";

        st = lw.compress(bef, true);
        System.out.println(st);
        System.out.println("Length before: " + bef.length() * 8);
        System.out.println("Length before huff:" + h.compact(bef).length());
        System.out.println("rate: " + ((double) h.compact(bef).length() / ((double) bef.length() * 8.0)));
        System.out.println("Length after: " + st.length() * 8);
        System.out.println("Length after huff:" + h.compact(st).length());
        System.out.println("rate: " + ((double) h.compact(st).length() / ((double) st.length() * 8.0)));
    }

}
