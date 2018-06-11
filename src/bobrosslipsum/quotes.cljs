(ns bobrosslipsum.quotes)

(def lines
  [;; Series 1, Episode 2
   "Sometimes the brush is lazy."
   "This is the lazy man's way of painting."
   "Use what happens naturally."
   "Don't want to set these clouds on fire."
   "You can end up with great big cotton balls in the sky if you're not careful."
   "Learn to control it."
   ;; Series 1, Episode 4
   "Make big billowy, fluffy clouds."
   "Just sorta work it around and around here."
   "We want this swirling, churning actions here."
   "Keep this brush moving all the time."
   "Now we're ready to start working it."
   "Always doing the things furthest away first and working forward."
   "Always follow the angles here."
   "It's cold, but it's beautiful."
   ;; Series 2, Episode 1
   "See how easy that was?"
   "It's very easy to make a sky darker, but it's a son of a gun to make it lighter."
   "Another thing that seems to give us a lot of problems is almighty clouds."
   "Now we'll fluff it."
   "Now, very gently, we'll hypnotize it."
   "Everybody likes mountains."
   "Always follow the angles."
   "See? I knew you could do it!"
   "Talent is a pursued interest."
   "Anything you are willing to practice, you can do!"
   ;; Series 2, Episode 2
   "I used to work for weeks to make a tree."
   "We are really trying to teach you a technique. We're not trying to teach you to copy."
   "Let your imagination be your guide."
   "Do whatever feels right."
   "There's no big secret to this."
   "Oh, the agony! I remember it."
   "I'm a nature freak."
   "You need to understand nature."
   "We spend so much of our lives looking, but never, never seeing."
   ;; Series 3, Episode 4
   "That's the most fun of all."
   "Just mix it up real good."
   "Now let's use the fan brush."
   "You just sort of have to make almighty decisions."
   ;; Series 3, Episode 10
   "Every series, we need to have a crazy day."
   "We're ready to get serious with this."
   "See how far away that looks already?"
   "We'll start playing a little bit."
   "I love to make trees."
   "Use your imagination."
   "We're gonna give him some buns to sit on."
   "Talent is nothing more than a pursued interest."
   "It should give you a lot of ideas of a lot of crazy things you can do."
   ;; Series 4, Episode 2
   "Just let it bounce around and play."
   "Let's build a happy little cloud in the sky."
   "You can do all this blending without becoming a mud-mixer."
   "It's too far away."
   "Painting used to drive me crazy."
   "It takes a very, very little bit."
   "Every time you add another plane, you create more depth."
   "Just walk right back into this painting."
   "Look at all those... thousands of leaves!"
   "You could sit there with your one-haired brush for a week trying to do that, or you can do it in one stroke with an almighty brush!"
   "Don't be afraid of it."
   "Don't worry about it; have fun with it!"
   "All you need is a dream in your heart."
   ;; Series 4, Episode 3
   "Get a nice, even distribution of paint all through the bristles."
   "Let's just sort of play a little color here and there."
   "I'm always looking for a nice, easy way to do this."
   "If you're gonna do mountains, it's fun to have little bumps on them here and there."
   "All you're doing here is whisper-light."
   "If you over-mix it, you just get one dead color."
   ;; Series 5, Episode 4
   "We never duplicate anything exactly."
   "You can always add more if you want it."
   "Brush mix!"
   "Don't let your trees get too symmetrical... too even."
   "All these little things make it interesting."
   "Find out which one works best for you, and that's the one that you want to use."
   "Angles are very, very important."
   "This is your dirt, so you put it where you want it."
   ;; Series 5, Episode 10
   "I want to do something that's just a little bit different, and I think you'll find it's fun."
   "Start with a small amount and blend upward."
   "You can begin making all kinds of beautiful shapes up in the sky."
   "Let the brush play and have fun -- let it go!"
   "Chickens need a place to live too."
   "Use a color that's a little more muted and quiet."
   "Let's have some fun today."
   "Give this ol' windmill a leg!"
   "Don't be afraid of this big brush."
   "Let us know, and we'll do some more crazy things for you."
   ;; Series 6, Episode 2
   "Ready to go!"
   "Just let it go, have fun."
   "Leave some open spots here and there."
   "Only takes a minute."
   "He lives right there -- that's his home."
   "Try not to kill it."
   "However you want to change this, that's the way it should be."
   "Now we can start picking out some individual things."
   "Here and there and there and here."
   "Let's work on that tree right there."
   "You don't want it to be flat."
   ;; Series 6, Episode 7
   "All these fantastic things... they just sorta happen."
   "You can blend this until it absolutely goes away and leaves you."
   "Get it to where you want it, and leave it alone."
   "Don't piddle with them -- don't worry about them."
   "It's always trying to go somewhere that it can be level."
   "Feel the power of the water."
   "We'll make those decisions later."
   ;; Series 7, Episode 4
   "Take right off today!"
   "Let some little things just shine through."
   "Leave a little area open here."
   "That's why I like it so much."
   "Just dance it around."
   "Keep it moving."
   "We're looking for happy little clouds."
   "Sort of mix it up."
   "Get tough with it."
   "We planned this son-of-a-gun right from the beginning."
   "You wouldn't buy somebody else's mistakes; nobody's going to buy yours."
   "Think like a tree when you do these."
   ;; Series 7, Episode 8
   "I want some happy little things happening up here in the sky."
   "Help them make a happy buck or two."
   "That knife's a little big... let me get my small knife."
   "Let 'em have it!"
   "Follow these angles."
   "Don't want to overkill."
   "That gives us a general idea of how that mountain was made."
   "That son-of-a-gun is growing on us!"
   "Give him some arms -- a tree needs some arms."
   ;; Series 8, Episode 1
   "Blend color right here on the canvas."
   "Don't want to set the sky on fire."
   "Be sure it's odorless or you'll be working by yourself."
   "You do it the way that you want it."
   "Use a lot of pressure."
   "All you're worried about is this nice outside shape."
   "Very soft, very quiet."
   "We all need a friend."
   "Make friends with trees."
   "Don't get carried away."
   ;; Series 8, Episode 8
   "Let it sort of bounce around and play."
   "Be... so... careful!"
   "Let's build us a mountain!"
   "We'll make some big ol' huge mountains!"
   "Pretend you're a whisper floating across here."
   "Wiggle it, then sharpen it."
   "Oh dear, here comes a tree!"
   "When the birds take over, I'll have friends!"
   "As usual, Bob's gonna do a big tree."
   ;; Series 9, Episode 6
   "Just leave that space open."
   "Drop in some happy little shadows."
   "He's a healthy cloud."
   "Just sorta stir it up, don't overdo -- just enough to bring it together."
   "We're just looking for a nice, basic, outside shape. We could care less what's going on inside here."
   "Water breaks, and it churns, and it has fun!"
   "Hit it, and get away from it."
   ;; Series 9, Episode 10
   "We're looking for a nice, even distribution of color."
   "Let's have some big, fluffy clouds in this painting."
   "We'll just sort of slip in some clouds."
   "You have to sort of plan these clouds."
   "You do whatever works for you."
   "Create that little fuzzy look."
   "Don't worry about it -- just sort of throw it in."
   "Big buildings are just little buildings that had a shot of vitamins."
   "We don't know where that goes."
   "Go out and spend some time talking to a tree."
   "Trees are nice people."
   ;; Series 10, Episode 1
   "Just make little X's, and we'll put in a happy little sky."
   "Pull from the outside in."
   "Let's make some big, fluffy clouds today!"
   "You have to make an almighty decision."
   "They are restricted only by your imagination."
   "Pretend that if you're not careful your hand will literally just float away."
   "It's just a game of angles."
   "If there's a secret to anything, it's practice."
   "Just practice, and you really can do this."
   "And that easy, we've got a happy mountain."
   "Painting does not have to be difficult."
   ;; Series 11, Episode 1
   "Dance in a happy little sky."
   "One of our golden rules is that thin paint will stick to thick paint."
   "Be careful with this bright red -- it'll eat up your whole world in a heartbeat."
   "Think like a cloud."
   "Don't overwork -- be lazy!"
   "Get strong with it."
   "If there's any secret to this technique, or any other technique: it's practice."
   "It doesn't take much, but you have to devote that time."
   ;; Series 11, Episode 4
   "Let's go on up here and let's get started."
   "Just sorta twist in a little sky."
   "Blend it all together and have fun with it."
   "Tongue got over my teeth there and I couldn't see what I was saying."
   "I would put water in just about everything."
   "Wind this up and blend it together."
   "Clouds could very well be the freest things in nature."
   "Let 'em have fun."
   "The round brush is so fun, let's go back to that."
   "As long as you have fun and learn from it, nothing is wasted."
   "If you want to be good at anything, you have to practice."
   ;; Series 12, Episode 1
   "Let's put in a happy little sky."
   "Just make little criss-cross strokes."
   "See how easy that is?"
   "This piece of canvas is your world."
   "They just sort of bounce around and have fun up there."
   "You really cannot make a mistake here."
   ;; Series 13, Episode 4
   "Today, we have to make a big decision."
   "They think you're magic!"
   "Just sorta rock back and forth."
   "Just sorta make these things up in your mind, and let them drop in."
   "We use darkness to make those colors stand out!"
   "That's one of those happy accidents."
   "Your artist license gives you complete freedom."
   "A place you want to go and run through bare-footed."
   ;; Series 13, Episode 9
   "This is such a super day!"
   "These are far away, and I'm not looking for a lot of detail."
   "I don't know if you can ever make a pet out of an alligator, but I had an alligator who lived with me."
   "It helps, when you're doing these kinds of things, make up little stories in your mind."
   "This is where the whole ecosystem starts."
   "We're like drug dealers -- we come into town and get people absolutely addicted to painting."
   "It doesn't hurt anybody, everybody's happy, and it brings a lot of joy to people."
   "We have to have some fun."
   ;; Series 14, Episode 13
   "It takes very little color."
   "Drop in a happy little sky here."
   "Everything should get lighter toward the horizon."
   "I think we'll put a happy little cloud up in the sky."
   "Maybe this is the same cloud."
   "There's some little stringy ones that live down here."
   "Give it a lift-upper."
   "Show it who's boss!"
   "You're limited only by your imagination."
   "I like to be able to create my own world."
   ;; Series 15, Episode 9
   "All kinds of beautiful little things just happen."
   "Sing along as you're doing this."
   "That's the job I want in my next life -- I wanna come back and be a cloud and just float around and have a good time."
   "That's a fantastic little cloud."
   "Create the illusion."
   "It'll open whole new worlds for you once you learn to make friends with this knife."
   "Cover a couple of cameramen, and we're in business!"
   ;; Series 16, Episode 5
   "Son of a gun, it looks like we've got two big eyes on there."
   "This is how you make a giant cartoon figure."
   "That's what makes it fun! Just enjoy!"
   "I just like to wash brushes."
   "Where do the clouds live in your world?"
   "Everybody needs to sing in the sunshine!"
   "Just like baking a cake!"
   "Learn to work with anything that happens."
   "You knew it was there all the time."
   "Let's make this a little more interesting."
   ;; Series 17, Episode 2
   "We don't want to overload it, just a little bit."
   "I'm lazy... I look for easy ways to do things."
   "That blue is so strong, it'll eat up your whole world in a heartbeat."
   "...three hairs and some air..."
   "Don't let this get too strong or it'll stand out."
   "You have unlimited power here."
   "You can create any illusion that you can conceive in your mind."
   "Don't fight these things -- allow them to happen."
   "Just tap. Give it that little push."
   "If you're going to knock a wasp's nest down, you run."
   "Have to have dark in order to show light."
   ;; Series 18, Episode 3
   "A thin, and let me say that again, a THIN layer of liquid clear."
   "Always keep the brush moving."
   "Use that to your advantage."
   "Don't just cover it all up -- leave these spots!"
   "Mountains come in all shapes and sizes."
   "Learn to use this knife, and you won't believe what it can do!"
   "You have to make friends with it."
   "Devote a little time to working with it."
   ;; Series 19, Episode 12
   "Maybe we will have a little moon up here."
   "People are so excited when they see this happen."
   "Always start with a clean brush in a light area and work outward."
   "We'll just take the brush strokes out."
   "The other thing that is so fantastic about painting is that it teaches you to see."
   "Don't over do it -- be careful. Be careful."
   "Just follow your imagination."
   "We can stir this up a little bit."
   "You can continue to blend it until it just goes away."
   "Begin laying in just some beautiful little highlights."
   "There's nothing worse than an angry tree."
   "I want this one a little bit darker."
   "Do you want to get crazy?"
   ;; Series 20, Episode 1
   "I think we'll just do a happy little picture today."
   "We'll have a super time."
   "Let's make some happy little clouds in our world."
   "Wherever you think they should be, then that's exactly where they should be."
   "Wind it up, blend it together."
   "I am a fanatic for water."
   "(chuckles) Just beat the devil out of it."
   "This is where you take out all your frustrations and all your hostilities, and just have a good time."
   "All we're trying to do is teach you a technique and turn you loose on the world."
   "We use no patterns, and no tracings."
   "All we do is just sorta have an idea in our mind, and we just sorta let it happen."
   "You learn to take advantage of whatever happens and use it to make your painting special."
   "Mix it up, just like you're making a cake or something."
   "...two hairs and some air..."
   "Let's get crazy."
   "I don't want a lot of mountains today."
   "That's about all we need."
   "Look at your painting and make a decision."
   "I lived in Alaska for many, many years."
   "This is a very individual thing, painting is."
   ;; Series 21, Episode 1
   "It's easy to add more color, but it's a son of a gun to take it away."
   "Very gently go across the entire sky."
   "...right on the edge of the blade..."
   "Everybody will see nature through different eyes"
   "Everybody has their own idea of what a mountain should look like."
   "Let it float right down the side of the mountain."
   "Zooooom... you've gotta make the little noises or it doesn't work right."
   "Painting is as individual as people are."
   "At some point in between, you have to reach a happy medium."
   "I'll bet you didn't realize you had that much power."
   "You can do anything that you want to do... you can move mountains!"
   "You can determine what your world is like."
   ;; Series 22, Episode 9
   "Let's just have a good time."
   "Today's such a wonderful day, let's just make a happy little painting."
   "Nothing to it."
   "A very quiet little sky."
   "You know me -- I like water."
   "Think about form and shape -- how do you want this thing to be?"
   "A half a hair and some air."
   "Beautiful little roundy-hill-type things."
   "A flock of trees? I don't know... a STAND of trees. That's what you call them!"
   ;; Series 23, Episode 2
   "Let's really have some fun."
   "Now things are going to start happening."
   "You'll be amazed at some of the effects you can achieve."
   "It's very hard to see your painting when you're right up against it."
   "We become mud-mixers."
   "Maybe there's a happy little tree... he lives right there."
   "The more that you practice, the more you're able to visualize things."
   "You know me, I get crazy."
   ;; Series 23, Episode 3
   "I want to darken the edges."
   "Fun time! Now we wash the ol' brush!"
   "Let's build us a little cloud."
   "Don't just throw it up there and think that a cloud will appear."
   "That was so much fun! Let's get crazy!"
   "You want to be able to control these rascals."
   "Just make it up."
   "You've got to have a little sadness once in awhile to let you know when the good times come."
   ;; Series 24, Episode 3
   "I thought today, this would be our crazy painting."
   "I think you'll be tickled with what you can do with something that starts out looking this bad."
   "Just gonna start any ol' where."
   "You'll be amazed at what you can do if you'll just try."
   "Practice visualizing things in your mind."
   "Don't be afraid to experiment."
   "You're gonna have one WILD day!"
   "The birds would get sort of crazy."
   "Stir them up a little, then blend them."
   "If everything was good all the time, pretty soon you'd be accepting that as normal."
   "You decide where all these things are."
   "There's too many complicated things in our life already."
   ;; Series 24, Episode 7
   "That's the fun part of this whole technique."
   "Really be stingy with it."
   "The just do nice things for you."
   "You don't have to tell them you did this with a paper towel."
   "Enough of that."
   "They are very special. Take care of those!"
   "Quiet, quiet little bushes."
   "A place for all the little creatures to put their money."
   "We don't know exactly where this is gonna go, and we don't care at this point."
   "In the woods, you have all different colors of green."
   "Don't be afraid to have a lot of greens."
   ;; Series 25, Episode 3
   " That's pretty already, shoot... but we're not gonna stop there."
   "Just let it sorta dance around in the sky."
   "We'll put a few little nicety things in there."
   "Clouds have form and shape and life and are interesting, they're not just ol' dull clouds."
   "When I finally got to Alaska, whew boy, I just went crazy"
   "The only thing I'm good at is falling down."
   "I look for easy ways to do things."
   ;; Series 25, Episode 6
   "Say all that with a mouthful of rocks."
   "I'll show you exactly the kind of messes we get into sometimes."
   "I really don't know what we're gonna do except have some fun."
   "Painters are expected to be different."
   "Remember where your finger's been before you scratch your nose."
   "Don't be afraid to experiment."
   "Don't be afraid to go out on a limb once in a while."
   "Where are we going with this?"
   "Just have a good feeling... be happy, and in love with your life and your world."
   ;; Series 26, Episode 1
   "Let's get right to it."
   "This is one that you can do."
   "That simple, that easy!"
   "We'll just sort of see what happens."
   "That'll be a challenge!"
   "Let's have a big cloud!"
   "It's a lot of fun."
   "Nothing to it!"
   "It's bad when you have to tie a bucket on the side of your painting."
   "Time to get crazy now!"
   ;; Series 26, Episode 6
   "You'd better get out your big coat and put it on."
   "You know I'm crazy about water."
   "Let's have some fun!"
   "Make your own mind up about where your clouds should live."
   "Looks like there's a storm coming already."
   "You have to make these big decisions in your world."
   "You have unlimited power here."
   "You can do anything that you believe you can do."
   "Don't think there's anybody that doesn't like mountains. Well, maybe there is."
   "Time to get crazy."
   "Everybody should have a friend."
   "If you learn to make one tree, you can make a million trees."
   "It's the contrast in this painting that makes it so pretty."
   ;; Series 27, Episode 5
   "Very, very... let me say that one more time: very."
   "The smallest, very little amount."
   "Tell you what: let's get crazy today."
   "You can change your mind right mid stream."
   "I want a very gentle, quiet little sky."
   "Today, I want softness in our world... tranquility, quiet, peaceful."
   "Whatever works is good."
   ;; Series 27, Episode 11
   "Let's do a winter scene, what the heck."
   "Maybe I'll have a big mountain today."
   "Life's wonderful, isn't it?"
   "Let's make a wild mountain today."
   "If we make a boo-boo, it's right here -- but that's alright, because we don't make mistakes in our world."
   "You know what? Let's get crazy."
   "He's got the leanies!"
   ;; Series 28, Episode 3
   "Let's just do a painting that's fun."
   "Allow the colors to blend together."
   "It'll just eat up all the crimson in the world."
   "We don't care."
   "He just hangs around back there and has a good time all day."
   "Just a nice little mountain, a little friendly guy."
   "It doesn't matter in our world where it goes."
   "I like the mountains -- they're my favorite."
   "You can just go on and on and on."
   "Absolutely no limits!"
   "The joy of painting really is universal."
   "We've got a conglomeration going on there!"
   "Sometimes we get crazy here."
   "Now a little rabbit can hide down there and look over at us!"
   ;; Series 28, Episode 10
   "Let's just have some fun today."
   "Let me put a little on the other side too, we don't want it to feel left out."
   "Just sort of blend it around."
   "I want this to be very bright right in here."
   "I don't know exactly what they are, and I don't really care at this point."
   "Just let your imagination take you to anywhere you want to be."
   "Shh... our secret! Don't tell, just enjoy!"
   "Who knows? Get crazy!"
   ;; Series 29, Episode 5
   "Let's just enjoy today."
   "Anything that happens here, we can live with and we can turn it into something that looks pretty good most of the time."
   "Fun time!"
   ;; Series 29, Episode 9
   "That's exactly where it should be."
   "That's about enough right there."
   "Isn't life wonderful?"
   "Throw in some happy little things wherever you want them."
   "You make the big decisions where all these things live in your world."
   "Take your time and play with these things."
   "We don't know where it goes."
   "Let's do another one -- what the heck!"
   "All you do is just go back with it."
   "You don't have to work at it hardly at all."
   "Highlight a few of these rascals."
   "Great time!"
   ;; Series 30, Episode 2
   "Get nervous."
   "You know me -- I love water."
   "Let's do a happy little mountain."
   "Just let it float."
   "You make the big decisions."
   "We're not too worried about it today."
   "Painting offers freedom."
   "Bravery test!"
   "Shoot, I've got to get a little crazy."
   ;; Series 30, Episode 3
   "It's a fantastic day here!"
   "A winter scene that's very warm, very pretty, and will just make you feel good."
   "We'll just have a firecracker of a sky up here."
   "Let them have a good time in your world."
   "The cloud needs a little friend."
   "Just let it sort of run across here, wherever you want it to go."
   "Cherish it! Take care of it!"
   "Think about some basic shapes and forms in this -- don't just throw them on at random."
   "Do a cabin-ectomy."
   "I like big trees."
   ;; Series 31, Episode 3
   "It's a fantastic day here, and I hope it is wherever you're at."
   "We'll let our imaginations take us wherever we want to go today."
   "Anything that happens here, you can work with it."
   "You can do anything you desire on this canvas."
   "You can do it!"
   "You have to make all these big decisions when you have power."
   "You didn't know you had so much power, did you?"
   "Art is an expression of self."
   "If you comply with that rule, how can you go wrong?"
   "So many things you can create."
   ;; Series 31, Episode 7
   "Sort of an orangy-yellowish color."
   "OK, let's have some fun!"
   "Just decide basically where you wanna start, and off you go!"
   "The titles comes out of there, it sounds like an old car."
   "He's like the rest of us -- he's about half crazy."
   "Just go around and try them all."
   "That rascal's sneaky!"
   "You decide -- you have to make these big decisions."
   "Let's get crazy here."
   "Don't want much... don't want much..."
   "Everybody should paint what they see and what they feel."
   "A lot of things happening right here."
   ])
