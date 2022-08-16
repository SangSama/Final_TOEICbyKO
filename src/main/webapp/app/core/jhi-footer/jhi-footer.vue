<template>
  <div id="footer" class="footer">
    <p v-text="$t('footer')">--- HUST - SEEE - CE - Nguyễn Thị Kim Oanh - 20172743 - Kỳ 2021.2 ---</p>
  </div>
</template>


<script lang="ts" src="./jhi-footer.component.ts"></script>


<style>
#footer {
  /*position:absolute;*/
  bottom:0;
  width:100%;
  height:40px;
}

.footer {
  background-color: #b2687c;
  color:#ffffff ;
}

p {
  line-height: 40px;
  text-align: center;
}
</style>
