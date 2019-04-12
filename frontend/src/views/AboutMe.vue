<template>
  <div class="container">
    <div class="row">
      <div class="col-4">
        <b-card bg-variant="dark"
                header="Contact Me:"
                :img-src="profilePicture">
          <b-card-text>
            <div><strong>Email:</strong> {{contactEmail}}</div>
            <div><strong>Phone:</strong> {{phoneNumber}}</div>
          </b-card-text>
        </b-card>
      </div>
      <div class="col-8">
        <b-card bg-variant="dark"
                header="Acout Me">
          <b-card-text>{{profileDescription}}</b-card-text>
        </b-card>
        <b-card bg-variant="dark"
                header="Check out my profile"
                class="mt-2">
          <b-card-text>
            <div>
              <strong>LinkedIn: </strong> <a :href="linkedin">{{linkedin}}</a>
            </div>
            <div>
              <strong>Github: </strong> <a :href="github">{{github}}</a>
            </div>
          </b-card-text>
        </b-card>
      </div>
    </div>
  </div>
</template>

<script>
  export default {
    profileName: 'aboutme',
    computed: {
      profilePicture() {
        return this.$store.state.profile.profilePicture
      },
      contactEmail() {
        return this.$store.state.profile.contactEmail
      },
      profileDescription() {
        return this.$store.state.profile.profileDescription
      },
      linkedin() {
        return this.$store.state.profile.linkedin
      },
      github() {
        return this.$store.state.profile.github
      },
      phoneNumber() {
        return this.$store.state.profile.phoneNumber
      }
    }
  }
</script>

<style scoped>

  * {
    color: white;
  }
</style>
