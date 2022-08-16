<template>
  <div class="gramResult row">

    <!--tieu de-->
    <div class="title">
      <h1 class="display-4" v-text="$t('finalProjectApp.userGrammarList.grammar.title')">Grammar</h1>
      <div>
        <div class="el-breadcrumb">
          <span class="el-breadcrumb__item">
            <router-link class="item" to="/" v-text="$t('home.about.home')">Home</router-link>
            <span class="el-breadcrumb__separator">/</span>
          </span>
          <span class="el-breadcrumb__item">
            <router-link class="item" to="/users/grammar" v-text="$t('finalProjectApp.userGrammarList.grammar.topicList')">Grammar Topic List</router-link>
            <span class="el-breadcrumb__separator">/</span>
          </span>
          <span class="el-breadcrumb__item">
            <router-link class="item" to="/users/grammar/gramTopic" v-text="$t('finalProjectApp.userGrammarList.grammar.topic02.title')">Simple Present & Present Continuous</router-link>
            <span class="el-breadcrumb__separator">/</span>
          </span>
        </div>
      </div>
    </div>

    <!-- -->
    <div class="container">
      <div class="result">
        <h2 v-text="$t('finalProjectApp.userGrammarList.gramResult.title')">GIẢI THÍCH</h2>
        <div class="question">
          <p><b>Question 1: </b>My parents normally __________ breakfast at 7:00 a.m.</p>
          <ul>
            <li><b>A. eat</b></li>
            <li>B. eats</li>
            <li>C. are eating</li>
            <li>D. is eating</li>
          </ul>
          <p><b>Dịch: </b>Bố mẹ tôi thường ăn sáng lúc 7h sáng. Câu này chỉ 1 thói quen nên ta dùng thì hiện
            tại đơn. “My parents” là chủ ngữ số nhiều --> động từ giữ nguyên dạng.</p>
        </div>
        <hr>
        <div class="question">
          <p><b>Question 2: </b>This week Barbara is away on business so Tom __________ dinner for
            himself.</p>
          <ul>
            <li>A. cook</li>
            <li>B. cooks</li>
            <li>C. are cooking</li>
            <li><b>D. is cooking</b></li>
          </ul>
          <p><b>Dịch: </b>Tuần này Barbara đi công tác nên Tom tự nấu ăn. Câu này chỉ một hành động tạm
            thời, không kéo dài lâu à vế thứ 2 chia ở thì hiện tại tiếp diễn</p>
        </div>
        <hr>
        <div class="question">
          <p><b>Question 3: </b>Barbara usually __________ dinner for her husband after work.</p>
          <ul>
            <li>A. cook</li>
            <li><b>B. cooks</b></li>
            <li>C. are cooking</li>
            <li>D. is cooking</li>
          </ul>
          <p><b>Dịch: </b>Barbara thường nấu ăn cho chồng sau giờ làm. Barbara là tên người - chủ ngữ ngôi
            3, số ít và “usually” là trạng từ chỉ tần suất thể hiện thói quen hàng ngày --> động từ chia
            ở thì hiện tại đơn, động từ chia ở số ít “eats”</p>
        </div>
        <hr>
        <div class="question">
          <p><b>Question 4: </b>John always __________ on time for meetings.</p>
          <ul>
            <li>A. arrive</li>
            <li><b>B. arrives</b></li>
            <li>C. are arriving</li>
            <li>D. is arriving</li>
          </ul>
          <p><b>Dịch: </b>John luôn luôn đúng giờ trong các cuộc họp. “always” (luôn luôn) - trạng từ chỉ tần
            suất, cho biết đây là 1 thói quen --> câu ở thì hiện tại đơn. John là chủ ngữ số ít --> thêm
            “s” vào sau động từ.</p>
        </div>
        <hr>
        <div class="question">
          <p><b>Question 5: </b>John __________ at this moment.</p>
          <ul>
            <li>A. arrive</li>
            <li>B. arrives</li>
            <li>C. are arriving</li>
            <li><b>D. is arriving</b></li>
          </ul>
          <p><b>Dịch: </b>Tom đang đến bây giờ. “at this moment” là dấu hiệu của thì hiện tại tiếp diễn. John
            là chủ ngữ ngôi 3, số ít --> động từ to be chia “is”</p>
        </div>
        <hr>
        <div class="question">
          <p><b>Question 6: </b>We often _________ tests at our school.</p>
          <ul>
            <li><b>A. do</b></li>
            <li>B. does</li>
            <li>C. is doing</li>
            <li>D. are doing</li>
          </ul>
          <p><b>Dịch: </b>Chúng tôi thường làm bài kiểm tra ở trường. “Often” (thường xuyên): dấu hiệu của
            thì hiện tại. “We” là chủ ngữ có nhiều nên động từ giữ nguyên.</p>
        </div>
        <hr>
        <div class="question">
          <p><b>Question 7: </b>I ________ to my teacher now.</p>
          <ul>
            <li>A. talk</li>
            <li>B. talks</li>
            <li><b>C. am talking</b></li>
            <li>D. is talking</li>
          </ul>
          <p><b>Dịch: </b>Tôi đang nói chuyện với giáo viên của tôi bây giờ. - “Now” (bây giờ) chỉ 1 hành động đang diễn ra tại hiện tại --> dùng thì hiện tại tiếp diễn. - “I” là chủ ngữ ngôi thứ nhất '--> đi với to be “am”</p>
        </div>
        <hr>
        <div class="question">
          <p><b>Question 8: </b>Look! Mandy and Susan _______a film on TV.</p>
          <ul>
            <li>A. watches</li>
            <li>B. is watching</li>
            <li>C. am watching</li>
            <li><b>D. are watching</b></li>
          </ul>
          <p><b>Dịch: </b>Nhìn kìa! Mandy và Susan đang xem phim trên ti vi. “Look!”: dấu hiệu của thì hiện
            tại tiếp diễn. “Mandy and Susan” là chủ ngữ số nhiều --> đi với to be “are”.</p>
        </div>
        <hr>
        <div class="question">
          <p><b>Question 9: </b>Listen! The band _______the new guitar.</p>
          <ul>
            <li>A. test</li>
            <li>B. am testing</li>
            <li><b>C. is testing</b></li>
            <li>D. are testing</li>
          </ul>
          <p><b>Dịch: </b>Ban nhạc đang kiểm tra chiếc ghi ta mới. “Listen!” là dấu hiệu của thì hiện tại tiếp
            diễn, cho biết hành động đang diễn ra tại thời điểm nói. “The band” là chủ ngữ số ít -->
            dùng to be “is”.</p>
        </div>
        <hr>
        <div class="question">
          <p><b>Question 10: </b>First I ______, then I dress.</p>
          <ul>
            <li><b>A. wash</b></li>
            <li>B. washes</li>
            <li>C. am washing</li>
            <li>D. are washing</li>
          </ul>
          <p><b>Dịch: </b>Đầu tiên tôi giặt, sau đó tôi mặc quần áo. 2 hành động xảy ra liên tiếp nhau. Mà
            hành động ở vế 2 chia ở hiện tại đơn nên vế 1 động từ cũng chia ở hiện tại đơn.</p>
        </div>
        <hr>
        <div class="question">
          <p><b>Question 11: </b>Quiet please! I ________ a test.</p>
          <ul>
            <li>A. do</li>
            <li><b>B. am doing</b></li>
            <li>C. is doing</li>
            <li>D. are doing</li>
          </ul>
          <p><b>Dịch: </b>Yên lặng nào! Tôi đang làm bài kiểm tra. “Quiet please!” - câu cảm thán, dấu hiệu
            cho biết hành động đang diễn ra --> động từ chia ở thì hiện tại tiếp diễn.</p>
        </div>
        <hr>
        <div class="question">
          <p><b>Question 12: </b>At the moment, the two kids _________on the floor.</p>
          <ul>
            <li>A. sit</li>
            <li>B. sits</li>
            <li><b>C. are sitting</b></li>
            <li>D. is sitting</li>
          </ul>
          <p><b>Dịch: </b>Hiện giờ, 2 đứa trẻ đang ngồi trên sàn nhà. “At the moment”: dấu hiệu cho biết thì
            hiện tại tiếp diễn. “the two kids” là chủ ngữ số nhiều --> to be chia là “are”</p>
        </div>
        <hr>
        <div class="question">
          <p><b>Question 13: </b>Jeff ________ a book right now, he _______ a story to Linda.</p>
          <ul>
            <li>A. hold – read</li>
            <li>B. holds – reads</li>
            <li><b>C. is holding - is reading</b></li>
            <li>D. are holding - are reading</li>
          </ul>
          <p><b>Dịch: </b>Jeff đang cầm 1 quyển sách, anh ấy đang đọc 1 câu chuyện cho Linda nghe. “right
            now”: dấu hiệu thì hiện tại tiếp diễn. 2 hành động xảy ra đồng thời --> cả 2 về đều chia ở
            hiện tại tiếp diễn.</p>
        </div>
        <hr>
        <div class="question">
          <p><b>Question 14: </b>Linda ________ Jeff’s stories.</p>
          <ul>
            <li>A. love</li>
            <li><b>B. loves</b></li>
            <li>C. am loving</li>
            <li>D. is loving</li>
          </ul>
          <p><b>Dịch: </b>Linda thích những câu chuyện của Jeff. Động từ “love” thường được dùng ở thì
            hiện tại đơn.</p>
        </div>
        <hr>
        <div class="question">
          <p><b>Question 15: </b>He ______a story to her every day.</p>
          <ul>
            <li>A. read</li>
            <li><b>B. reads</b></li>
            <li>C. am reading</li>
            <li>D. is reading</li>
          </ul>
          <p><b>Dịch: </b>Anh ấy đọc truyện cho cô ấy nghe mỗi ngày. “every day” - dấu hiệu của thì hiện tại
            đơn (diễn tả 1 thói quen hàng ngày). “He” là chủ ngữ ngôi 3, số ít --> động từ phải thêm
            s/es.</p>
        </div>
        <hr>
        <div class="question">
          <p><b>Question 16: </b>Jenny usually _______ to school, but today she _______ the bus because
            it _______ .</p>
          <ul>
            <li>A. cycle - take – rain</li>
            <li>B. cycles - takes – rains</li>
            <li>C. cycles - takes - is raining</li>
            <li><b>D. cycles - is taking - is raining</b></li>
          </ul>
          <p><b>Dịch: </b>Jenny thường đạp xe tới trường, nhưng hôm nay cô ấy sẽ đi xe buýt đến trường vì
            trời đang mưa. “usually” - dấu hiệu của thì hiện tại đơn. Nhưng vì hiện tại trời đang mưa
            --> hôm nay cô ấy có dự định khác --> chia take ở thì hiện tại tiếp diễn.</p>
        </div>
        <hr>
        <div class="question">
          <p><b>Question 17: </b>The train always __________ on time.</p>
          <ul>
            <li>A. leave</li>
            <li><b>B. leaves</b></li>
            <li>C. is leaving</li>
            <li>D. are leaving</li>
          </ul>
          <p><b>Dịch: </b>Con tàu luôn rời đi đúng giờ. “Always” (luôn luôn) là dấu hiệu của thì hiện tại đơn,
            diễn tả 1 thói quen. “The train” là chủ ngữ số ít --> thêm s/es vào sau động từ --> “leaves”</p>
        </div>
        <hr>
        <div class="question">
          <p><b>Question 18: </b>“What’s the matter? Why _________ (cry/you)?”</p>
          <ul>
            <li>A. do you cry</li>
            <li>B. you are crying</li>
            <li>C. is you crying</li>
            <li><b>D. are you crying</b></li>
          </ul>
          <p><b>Dịch: </b>“Có vấn đề gì vậy? Tại sao bạn khóc?” Câu đang diễn ra ở thời điểm nói --> hành
            động “khóc” đang xảy ra --> động từ chia ở thì hiện tại tiếp diễn.</p>
        </div>
        <hr>
        <div class="question">
          <p><b>Question 19: </b>I never ________ to the swimming pool.</p>
          <ul>
            <li><b>A. go</b></li>
            <li>B. goes</li>
            <li>C. is going</li>
            <li>D. am going</li>
          </ul>
          <p><b>Dịch: </b>Tôi chưa bao giờ đi tới bể bơi. Câu cho biết 1 thói quen là không đi tới bể bơi bao
            giờ --> động từ chia ở hiện tại đơn.</p>
        </div>
        <hr>
        <div class="question">
          <p><b>Question 20: </b>What will happen if we __________ water?</p>
          <ul>
            <li>A. not conserve</li>
            <li>B. are not conserve</li>
            <li><b>C. do not conserve</b></li>
            <li>D. does not conserve</li>
          </ul>
          <p><b>Dịch: </b>Chuyện gì sẽ xảy ra nếu chúng ta không bảo tồn nguồn nước? Câu điều kiện loại
            1, vế IF sẽ chia ở hiện tại đơn. “We” là chủ ngữ số nhiều --> dùng trợ động từ “do”, thêm
            “not” để thành lập dạng phủ định.</p>
        </div>
        <hr>
      </div>
    </div>

  </div>
</template>


<script lang="ts" src="./gramResult.component.ts"></script>


<style scoped>
/**/
.title {
  color: #ffffff;
  width: 100%;
  height: 150px;
  background-image: linear-gradient(to bottom right, #bb5975, #dca1b8);
  padding-top: 30px;
  padding-left: 100px;
}
.el-breadcrumb {
  padding-top: 10px;
  font-size: 14px;
  line-height: 1px;
}
.el-breadcrumb:before {
  display: table;
  content: "";
}
.item {
  color: #ffffff;
  font-weight: 700;
  text-decoration: none;
}
.item:hover {
  text-decoration: none;
  color: #ffffff;
  font-weight: 700;
}
.el-breadcrumb__separator {
  margin: 0 9px;
  font-weight: 700;
  color: #c0c4cc;
}

/**/
.result {

}

.result h2 {
  text-align: center;
  font-weight: bold;
  margin-top: 30px;
  margin-bottom: 15px;
}

.result .question {

}

.result .question:hover {
  background-color: #d5d3ff;
}

.result .question ul {

}

.result .question ul li {
  list-style-type: none;
}

.result p {
  text-align: left;
}

</style>

